package info.vziks.perfomance.clonevsnew;

import java.text.SimpleDateFormat;

/**
 * Class CloneNew
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Clone {

    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SimpleDateFormat localSdf = (SimpleDateFormat) sdf.clone();
        }
        System.out.println("Cloning : " + (System.currentTimeMillis() - start) + " ms");
    }
}
