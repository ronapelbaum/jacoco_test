package ron.server;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/5/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyMessageTest {

    private final String message = "This message obj was initiated in: ";

    @Test
    public void testGetMessage() throws Exception {
        String init = "init";
        MyMessage my = new MyMessage(init);
        assertEquals(my.getMessage(), message + init);
    }
}
