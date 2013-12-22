package ron.message;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/5/13
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloMessage {
    private final static String hello = "Hello ";
    protected String name;

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getMessage() {
        return hello + name;
    }

    public int getNameLength() {
        return name.length();
    }

    public void unit(){
        System.out.println("--->>> HelloMessage.unit()");
    }

    public void integration(){
        System.out.println("--->>> HelloMessage.integration()");
    }

    public static void invokedByHTMLMessage() {
        System.out.println("--->>> HelloMessage.invokedByHTMLMessage()");
    }
}