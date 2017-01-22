package edu.nwpu.rjwdz.chainofresponsibility;

/**
 * Created by lovywinsy on 2017/1/22.
 */
public class Message {
    public String text;
    public MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }
}
