package ron;

import ron.message.HelloMessage;

/**
 * Created with IntelliJ IDEA.
 * User: apelbaur
 * Date: 12/8/13
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyMessageBean {
    HelloMessage hm;

    public MyMessageBean(HelloMessage hm) {
        this.hm = hm;
    }

    public String getMessage(){
        return hm.getMessage();
    }
}
