package info.vziks.designpatterns.fundamentalpatterns.EventChannel;

/**
 * Class EventChannelTask
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class EventChannelTask {

    public void run() {
        EventChannel eventChannel = new EventChannel();

        PublisherInterface publisher1 = new Provider("John", "Cows", eventChannel);
        PublisherInterface publisher2 = new Provider("Mike", "Chickens", eventChannel);
        PublisherInterface publisher3 = new Provider("Nicole", "Rabbits", eventChannel);

        SubscriberInterface farmer1 = new Farmer("Stefan");
        SubscriberInterface farmer2 = new Farmer("Rob");
        SubscriberInterface farmer3 = new Farmer("Nicolas");


        eventChannel.subscribe(publisher1.getTopic(), farmer1);
        eventChannel.subscribe(publisher2.getTopic(), farmer1);
        eventChannel.subscribe(publisher2.getTopic(), farmer2);
        eventChannel.subscribe(publisher3.getTopic(), farmer2);
        eventChannel.subscribe(publisher3.getTopic(), farmer3);


        publisher1.publish("Delivery information: " + publisher1.getTopic());
        publisher2.publish("Delivery information: " + publisher2.getTopic());
        publisher3.publish("Delivery information: " + publisher3.getTopic());

    }
}
