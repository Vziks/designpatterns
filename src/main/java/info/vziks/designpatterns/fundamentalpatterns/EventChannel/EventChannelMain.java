package info.vziks.designpatterns.fundamentalpatterns.EventChannel;

/**
 * Class EventChannelMain
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class EventChannelMain {

    public static void main(String[] args) {
        EventChannelTask eventChannelTask = new EventChannelTask();
        eventChannelTask.run();

    }
}
