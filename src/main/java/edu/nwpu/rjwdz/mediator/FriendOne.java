package edu.nwpu.rjwdz.mediator;

/**
 * Created by lovywinsy on 1/17/17.
 */
public class FriendOne extends Friend {
    public FriendOne(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String msg) {
        mediator.send(this, msg);
    }

    public void notify(String msg) {
        System.out.println("Amit gets message: " + msg);
    }
}
