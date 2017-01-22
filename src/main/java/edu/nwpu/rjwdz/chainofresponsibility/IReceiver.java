package edu.nwpu.rjwdz.chainofresponsibility;

/**
 * Created by lovywinsy on 2017/1/22.
 */
public interface IReceiver {
    boolean processMessage(Message msg);
}
