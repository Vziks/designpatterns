package info.vziks.designpatterns.fundamentalpatterns.Delegate;

/**
 * Class FormatLookUp
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class FormatLookUp {
    public FormatInterface getFormatService(String serviceType) {

        if (serviceType.equalsIgnoreCase("xml")) {
            return new XMLService();
        } else {
            return new JSONService();
        }
    }
}
