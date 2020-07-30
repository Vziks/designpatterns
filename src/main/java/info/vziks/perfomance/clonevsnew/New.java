package info.vziks.perfomance.clonevsnew;

import java.text.SimpleDateFormat;

/**
 * Class New
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class New {
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SimpleDateFormat localSdf = new SimpleDateFormat("yyyy-MM-dd");
        }
        System.out.println("Creating : " + (System.currentTimeMillis() - start) + " ms");
    }
}
