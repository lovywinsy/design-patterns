package edu.nwpu.rjwdz.memento;

import org.junit.Test;

/**
 * Created by lovywinsy on 1/11/17.
 */
public class MementoTest {
    @Test
    public void mementoEx() {
        System.out.println("This is a memento pattern demo");
        Originator o = new Originator();
        o.setState("First state");

        Caretaker c = new Caretaker();
        c.saveMemento(o.originatorMemento());

        o.setState("Second state");
        o.revert(c.retrieveMemento());
    }
}
