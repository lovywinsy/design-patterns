package edu.nwpu.rjwdz.memento;

/**
 * Created by lovywinsy on 1/11/17.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
