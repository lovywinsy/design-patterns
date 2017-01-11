package edu.nwpu.rjwdz.memento;

/**
 * Created by lovywinsy on 1/11/17.
 */
public class Caretaker {
    private Memento m;

    public void saveMemento(Memento m) {
        this.m = m;
    }

    public Memento retrieveMemento() {
        return m;
    }
}
