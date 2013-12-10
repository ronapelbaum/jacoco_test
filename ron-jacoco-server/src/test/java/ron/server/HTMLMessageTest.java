package server;

import org.junit.Test;
import ron.server.HTMLMessage;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/10/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class HTMLMessageTest {
    @Test
    public void testGetHEMLMessage() throws Exception {
        String msg="this is my message";
        String htmlMessage = HTMLMessage.getHEMLMessage(msg);
        assertTrue(htmlMessage.startsWith("<html>"));
        assertTrue(htmlMessage.endsWith("</html>"));
        assertTrue(htmlMessage.contains(msg));
    }
}
