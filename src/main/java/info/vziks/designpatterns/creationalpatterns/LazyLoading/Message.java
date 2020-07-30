package info.vziks.designpatterns.creationalpatterns.LazyLoading;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;


/**
 * Class Message
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Message {

    private static final Logger LOGGER = LoggerFactory.getLogger(Message.class);

    public Message(String message) {
        LOGGER.debug("Creating Message ...");
        try {
            this.message = message;
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            LOGGER.error("Exception caught.", e);
        }
        LOGGER.debug("... Message created");
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}
