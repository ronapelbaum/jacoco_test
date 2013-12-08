package ron.server;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/5/13
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyMessage {
    private final String message = "This message obj was initiated in: ";
    private String initiator;

    public MyMessage(String initiator) {
        this.initiator = initiator;
    }

    public String getMessage() {
        return message + initiator;
    }
}