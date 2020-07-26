package info.vziks.designpatterns.fundamentalpatterns.EventChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class EventChannel
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class EventChannel implements EventChannelInterface {

    private final Map<String, List<SubscriberInterface>> topics;

    public EventChannel() {
        this.topics = new HashMap<>();
    }

    @Override
    public void publish(String topic, String message) {
        if (this.topics.containsKey(topic)) {
            for (SubscriberInterface subscriber :
                    this.topics.get(topic)) {
                subscriber.notify(message);
            }
        }
    }

    @Override
    public void subscribe(String topic, SubscriberInterface subscriber) {
        if (this.topics.containsKey(topic)) {
            this.topics.get(topic).add(subscriber);
        } else {
            List<SubscriberInterface> list = new ArrayList<>();
            list.add(subscriber);
            this.topics.put(topic, list);
        }

        System.out.printf("%s subscribe to %s\n", subscriber, topic);
    }
}
