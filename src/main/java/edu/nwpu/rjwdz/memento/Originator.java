package edu.nwpu.rjwdz.memento;

/**
 * Created by lovywinsy on 1/11/17.
 */
public class Originator {
    private String state;
    Memento m;

    public void setState(String state) {
        this.state = state;
        System.out.println("State at present : " + state);
    }

    public Memento originatorMemento() {
        m = new Memento(state);
        return m;
    }

    public void revert(Memento m) {
        System.out.println("Restoring to previous state...");
        state = m.getState();
        System.out.println("State at present : " + state);
    }
}
