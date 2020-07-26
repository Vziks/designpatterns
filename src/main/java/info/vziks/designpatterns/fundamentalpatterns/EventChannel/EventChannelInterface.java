package info.vziks.designpatterns.fundamentalpatterns.EventChannel;

/**
 * Interface EventChannelInterface
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface EventChannelInterface {
    void publish(String topic,String message);
    void subscribe(String topic, SubscriberInterface subscriber);

}
