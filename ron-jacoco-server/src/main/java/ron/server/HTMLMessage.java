package ron.server;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/9/13
 * Time: 6:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class HTMLMessage {

    private static final String START = "<html><body><h2>";
    private static final String END = "</h2></body></html>";

    public static String getHEMLMessage(String message) {
        return START + message + END;
    }
}
