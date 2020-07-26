package info.vziks.designpatterns.fundamentalpatterns.EventChannel;

/**
 * Class Farmer
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Farmer implements SubscriberInterface {

    private String name;

    public Farmer(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.printf("%s notify with %s\n", this.getName(), message);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Farmer {" +
                "name='" + name + '\'' +
                '}';
    }
}
