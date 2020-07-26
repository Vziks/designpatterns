package info.vziks.designpatterns.fundamentalpatterns.EventChannel;

/**
 * Interface PublisherInterface
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface PublisherInterface {
    void publish(String data);
    String getTopic();
}
