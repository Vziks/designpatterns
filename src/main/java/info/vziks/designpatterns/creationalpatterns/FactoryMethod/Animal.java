package info.vziks.designpatterns.creationalpatterns.FactoryMethod;

/**
 * Class Test
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void castVoice();
}
