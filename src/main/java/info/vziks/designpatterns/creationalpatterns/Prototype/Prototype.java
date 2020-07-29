package info.vziks.designpatterns.creationalpatterns.Prototype;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class Prototype
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Prototype {

    public static void main(String[] args) {

        int pages1 = 30;
        int pages2 = 50;

        JournalEdition journalEdition = new JournalEdition("Java prototype", pages1);
        JournalEdition anotherJournalEdition = (JournalEdition) journalEdition.copy();
        anotherJournalEdition.setPages(pages2);

        System.out.println(anotherJournalEdition.getPages() == pages2);
        System.out.println(journalEdition.getPages() == pages1);


        System.out.println(journalEdition);
        System.out.println(anotherJournalEdition);

        BookEdition bookEdition = new BookEdition("Java patterns", 455);
        BookEdition anotherBookEdition = (BookEdition) bookEdition.copy();

        System.out.println(bookEdition);
        System.out.println(anotherBookEdition);

        List<Edition> editions = Arrays.asList(journalEdition, anotherJournalEdition, bookEdition, anotherBookEdition);
        List<Edition> editionsClones = editions.stream().map(Edition::copy).collect(Collectors.toList());

        System.out.println(editions);
        System.out.println(editionsClones);

    }
}
