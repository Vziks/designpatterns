package info.vziks.designpatterns.fundamentalpatterns.Delegate;

import java.text.Format;

/**
 * Class FormatClient
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class FormatClient {
    FormatDelegate formatService;

    public FormatClient(FormatDelegate formatService){
        this.formatService  = formatService;
    }

    public void doWork(){
        formatService.doWork();
    }
}
