package ron.message;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

/**
 * Created by apelbaur on 1/2/14.
 */
public class GoodbyeMessageTest extends TestCase {

    public static final String NAME = "bob";
    private GoodbyeMessage goodbyeMessage;

    @Override
    public void setUp() throws Exception {
        goodbyeMessage = new GoodbyeMessage(NAME);
    }

    public void testGetMessage() throws Exception {
        String message = "Goodbye ";
        assertEquals(goodbyeMessage.getMessage(), message + NAME);
    }
}
