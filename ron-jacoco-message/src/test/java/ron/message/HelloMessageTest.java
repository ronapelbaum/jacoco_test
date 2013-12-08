package ron.message;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/8/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloMessageTest {

    private final String message = "Hello ";

    @Test
    public void testGetMessage() throws Exception {
        String name = "name";
        HelloMessage my = new HelloMessage(name);
        assertEquals(my.getMessage(), message + name);
    }
}
