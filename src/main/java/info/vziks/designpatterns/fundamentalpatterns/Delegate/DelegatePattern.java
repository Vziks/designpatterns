package info.vziks.designpatterns.fundamentalpatterns.Delegate;

/**
 * Class DelegatePattern
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class DelegatePattern {

    public static void main(String[] args) {
        FormatDelegate formatDelegate = new FormatDelegate();
        formatDelegate.setServiceType("XML");

        FormatClient client = new FormatClient(formatDelegate);
        client.doWork();

        formatDelegate.setServiceType("JSON");
        client.doWork();
    }
}
