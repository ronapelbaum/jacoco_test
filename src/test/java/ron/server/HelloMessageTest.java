package ron.server;

import org.junit.Test;
import ron.server.message.HelloMessage;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/5/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloMessageTest {

    private final String message = "Hello ";

    @Test
    public void testGetMessage() throws Exception {
        //test 1
        String name = "name1";
        HelloMessage my = new HelloMessage(name);
        assertEquals(my.getMessage(), message + name);
        //test 2
        name = "name2";
        my = new HelloMessage(name);
        assertEquals(my.getMessage(), message + name);
    }
}
