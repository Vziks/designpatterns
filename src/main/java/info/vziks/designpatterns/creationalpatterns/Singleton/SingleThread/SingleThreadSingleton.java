package info.vziks.designpatterns.creationalpatterns.Singleton.SingleThread;

/**
 * Class SingleThreadSingleton
 *
 * @author Anton Prokhorov
 * Наивный Одиночка (один поток)
 * Naive Solo (single thread)
 */
public final class SingleThreadSingleton {

    private static SingleThreadSingleton instance;
    public String string;

    public SingleThreadSingleton(String string) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.string = string;
    }

    public static SingleThreadSingleton getInstance(String value) {
        if (instance == null) {
            instance = new SingleThreadSingleton(value);
        }
        return instance;
    }
}
