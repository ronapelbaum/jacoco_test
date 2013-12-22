package ron;

import org.junit.Test;
import ron.message.HelloMessage;
import ron.server.HTMLMessage;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/10/13
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyIntegrationTest {

    public static final String NAME = "test";

    @Test
    public void testStuff1(){
        HelloMessage helloMessage = new HelloMessage(NAME);
        assertTrue(helloMessage.getNameLength()=="test".length());

        String htmlMessage = HTMLMessage.getHEMLMessage(helloMessage.getMessage());
        assertTrue(htmlMessage.contains(helloMessage.getMessage()));
    }

    @Test
    public void testIntegration() throws Exception {
        HelloMessage hm  = new HelloMessage("a");
        hm.integration();

        HTMLMessage.integration();
    }

    @Test
    public void testInvoke() throws Exception{
        HTMLMessage.invoke();
    }
}
