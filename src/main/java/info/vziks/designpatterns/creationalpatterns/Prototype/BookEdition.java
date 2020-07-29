package info.vziks.designpatterns.creationalpatterns.Prototype;

/**
 * Class BookEdition
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class BookEdition extends Edition {

    public BookEdition(String type, int pages) {
        super(type, pages);
    }

    @Override
    public Edition copy() {
        return new BookEdition(this.getName(), this.getPages());
    }

    @Override
    public String toString() {
        return "BookEdition{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
