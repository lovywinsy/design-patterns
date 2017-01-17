package edu.nwpu.rjwdz.mediator;

/**
 * Created by lovywinsy on 1/17/17.
 */
public class Boss extends Friend {
    public Boss(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String msg) {
        mediator.send(this, msg);
    }

    public void notify(String msg) {
        System.out.println("Boss sees message: " + msg);
    }
}
