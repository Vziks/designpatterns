package info.vziks.designpatterns.fundamentalpatterns.Delegate;

/**
 * Class XMLService
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class XMLService implements FormatInterface {
    @Override
    public void processing() {
        System.out.println("process xml");
    }
}
