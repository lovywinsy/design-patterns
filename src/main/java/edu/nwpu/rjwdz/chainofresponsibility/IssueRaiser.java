package edu.nwpu.rjwdz.chainofresponsibility;

/**
 * Created by lovywinsy on 2017/1/22.
 */
public class IssueRaiser {
    public IReceiver setFirstReceiver;

    public IssueRaiser(IReceiver firstReceiver) {
        this.setFirstReceiver = firstReceiver;
    }

    public void raiseMessage(Message msg) {
        if (null != setFirstReceiver) {
            setFirstReceiver.processMessage(msg);
        }
    }
}
