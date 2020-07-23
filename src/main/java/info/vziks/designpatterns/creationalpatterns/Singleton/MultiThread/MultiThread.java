package info.vziks.designpatterns.creationalpatterns.Singleton.MultiThread;

/**
 * Class MultiThread
 *
 * @author Anton Prokhorov
 */
public class MultiThread {

    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("FOO");
            System.out.println(singleton.string);
            System.out.println(singleton);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("BAR");
            System.out.println(singleton.string);
            System.out.println(singleton);
        }
    }
}
