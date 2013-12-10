package ron.message;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/8/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloMessageTest {

    private final String message = "Hello ";
    private HelloMessage helloMessage;
    public static final String NAME1 = "alexander";

    @Before
    public void setUp() throws Exception {
        helloMessage = new HelloMessage(NAME1);
    }

    @Test
    public void testGetMessage() throws Exception {
        assertEquals(helloMessage.getMessage(), message + NAME1);

    }

    @Test
    public void testGetNameLength() throws Exception {
        assertTrue(helloMessage.getNameLength() == NAME1.length());

    }
}
