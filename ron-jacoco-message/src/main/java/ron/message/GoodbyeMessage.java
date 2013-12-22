package ron.message;

import ron.message.HelloMessage;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/22/13
 * Time: 10:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoodbyeMessage extends HelloMessage{
    public static final String goddbye = "Goodbye ";
    public GoodbyeMessage(String name) {
        super(name);
    }


    @Override
    public String getMessage() {
        return goddbye + name;
    }
}
