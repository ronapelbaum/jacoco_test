package ron.server.message;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/5/13
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloMessage {
    private final String hello = "Hello ";
    private String name;

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getMessage() {
        return hello + name;
    }

    public int getNameLength() {
        return name.length();
    }
}