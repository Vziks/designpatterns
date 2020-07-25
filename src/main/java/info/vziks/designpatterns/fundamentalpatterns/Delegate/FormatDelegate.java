package info.vziks.designpatterns.fundamentalpatterns.Delegate;

/**
 * Class FormatDelegate
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class FormatDelegate {
    private final FormatLookUp lookupService = new FormatLookUp();
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doWork() {
        FormatInterface formatService = lookupService.getFormatService(serviceType);
        formatService.processing();
    }
}
