package info.vziks.designpatterns.creationalpatterns.LazyLoading;

/**
 * Class HolderMessage
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class HolderMessage {

    private Message message;

    public Message getMessage() {

        if (message == null) {
            message = new Message("Message");
        }
        return message;
    }

    public static void main(String[] args) {
        HolderMessage holderMessage = new HolderMessage();
        System.out.println(holderMessage.message);
        holderMessage.getMessage();
        System.out.println(holderMessage.getMessage().getMessage());
    }
}
