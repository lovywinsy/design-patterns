package edu.nwpu.rjwdz.chainofresponsibility;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/22.
 */
public class ChainOfResponsibilityTest {
    @Test
    public void chainOfResponsibilityEx() {
        System.out.println("This is a chain of responsibility pattern demo");
        IReceiver faxHandler, emailHandler;

        emailHandler = new EmailErrorHandler(null);
        faxHandler = new FaxErrorHandler(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax is reaching late to the destination", MessagePriority.Normal);
        Message m2 = new Message("Email is not going", MessagePriority.High);
        Message m3 = new Message("In Email, BCC field is disabled occasionally", MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination", MessagePriority.High);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
