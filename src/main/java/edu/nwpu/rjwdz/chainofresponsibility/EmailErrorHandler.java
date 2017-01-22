package edu.nwpu.rjwdz.chainofresponsibility;

/**
 * Created by lovywinsy on 2017/1/22.
 */
public class EmailErrorHandler implements IReceiver {
    private IReceiver nextReceiver;

    public EmailErrorHandler(IReceiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public boolean processMessage(Message msg) {
        if (msg.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + msg.priority + "priority issue: " + msg.text);
            return true;
        } else {
            if (null != nextReceiver) {
                nextReceiver.processMessage(msg);
            }
        }
        return false;
    }
}
