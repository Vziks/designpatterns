package info.vziks.designpatterns.creationalpatterns.Singleton.MultiThread;

/**
 * Class MultiThreadSingleton
 *
 * @author Anton Prokhorov
 */
public final class MultiThreadSingleton {
    private static volatile MultiThreadSingleton instance;

    public String string;

    private MultiThreadSingleton(String string) {
        this.string = string;
    }

    public static MultiThreadSingleton getInstance(String string) {
        if (instance == null) {
            synchronized (MultiThreadSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadSingleton(string);
                }
            }
        }
        return instance;
    }
}
