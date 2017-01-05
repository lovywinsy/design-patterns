package edu.nwpu.rjwdz.facade;

import org.junit.Test;

/**
 * Created by lovywinsy on 1/5/17.
 */
public class FacadeTest {
    @Test
    public void facadeEx() {
        System.out.println("This is a facade pattern demo");
        RobotFacade rf = new RobotFacade();
        rf.constructRobot("Green", "Wood");
    }
}
