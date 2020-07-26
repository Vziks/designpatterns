package info.vziks.designpatterns.fundamentalpatterns.EventChannel;

/**
 * Class Provider
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Provider implements PublisherInterface {

    private String name;
    private String topic;
    private EventChannelInterface eventChannel;

    public Provider(String name, String topic, EventChannelInterface eventChannel) {
        this.name = name;
        this.topic = topic;
        this.eventChannel = eventChannel;
    }

    public String getTopic() {
        return topic;
    }

    public EventChannelInterface getEventChannel() {
        return eventChannel;
    }

    public void publish(String message) {
        this.eventChannel.publish(this.topic, message);
    }

    public String getName() {
        return name;
    }
}
