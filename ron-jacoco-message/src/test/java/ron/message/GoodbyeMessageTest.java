package ron.message;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

/**
 * Created by apelbaur on 1/2/14.
 */
public class GoodbyeMessageTest extends HelloMessageTest {

    private GoodbyeMessage goodbyeMessage;

    @Override
    public void setUp() throws Exception {
        message = "Goodbye ";
        goodbyeMessage = new GoodbyeMessage(NAME1);
    }

    public void testGetMessage() throws Exception {
        assertEquals(goodbyeMessage.getMessage(), message + NAME1);
    }
}
