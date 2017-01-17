package edu.nwpu.rjwdz.mediator;

/**
 * Created by lovywinsy on 1/17/17.
 */
public abstract class Friend {
    protected Mediator mediator;
    public String name;

    public Friend(Mediator mediator) {
        this.mediator = mediator;
    }


}
