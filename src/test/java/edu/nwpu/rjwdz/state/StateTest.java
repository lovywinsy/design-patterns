package edu.nwpu.rjwdz.state;

import org.junit.Test;

/**
 * Created by lovywinsy on 1/12/17.
 */
public class StateTest {
    @Test
    public void stateEx() {
        System.out.println("This is a state pattern demo");
        Off initState = new Off();
        Television tv = new Television(initState);

        tv.pressButton();
        tv.pressButton();
    }
}
