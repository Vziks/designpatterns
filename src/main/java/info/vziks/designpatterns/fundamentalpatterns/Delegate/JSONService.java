package info.vziks.designpatterns.fundamentalpatterns.Delegate;

/**
 * Class JSONService
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class JSONService implements FormatInterface {
    @Override
    public void processing() {
        System.out.println("process json");
    }
}
