package info.vziks.designpatterns.creationalpatterns.Prototype;

/**
 * Class JournalEdition
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class JournalEdition extends Edition {

    public JournalEdition(String name, int pages) {
        super(name, pages);
    }

    @Override
    public Edition copy() {
        return new JournalEdition(this.getName(), this.getPages());
    }

    @Override
    public String toString() {
        return "JournalEdition{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
