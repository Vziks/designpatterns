package info.vziks.designpatterns.behavioralpatterns.Observer;

/**
 * Interface Observer
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface Observer {
    void update (float temperature, float humidity, int pressure);
}
