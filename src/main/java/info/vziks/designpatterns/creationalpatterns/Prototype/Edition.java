package info.vziks.designpatterns.creationalpatterns.Prototype;

/**
 * Class Edition
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public abstract class Edition {

    protected String name;
    protected int pages;

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public Edition(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public abstract Edition copy();

    public void setPages(int pages) {
        this.pages = pages;
    }
}
