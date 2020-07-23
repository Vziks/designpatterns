package info.vziks.designpatterns.creationalpatterns.Singleton.SingleThread;

/**
 * Class SingleThread
 *
 * @author Anton Prokhorov
 */
public class SingleThread {

    public static void main(String[] args) {
        SingleThreadSingleton singleton = SingleThreadSingleton.getInstance("FOO");
        SingleThreadSingleton anotherSingleton = SingleThreadSingleton.getInstance("BAR");
        System.out.println(singleton.string);
        System.out.println(anotherSingleton.string);
    }
}
