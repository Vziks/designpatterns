package info.vziks.perfomance.clonevsnew;

/**
 * Class CheckPerformance
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class CheckPerformance {

    public static void main(String[] args) {

        New news = new New();
        Clone clone = new Clone();

        news.run();
        clone.run();

    }
}
