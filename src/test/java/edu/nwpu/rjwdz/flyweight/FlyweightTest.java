package edu.nwpu.rjwdz.flyweight;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/15.
 */
public class FlyweightTest {
    @Test
    public void flyweightEx() throws Exception {
        System.out.println("This a flyweight pattern demo");
        RobotFactory factory = new RobotFactory();
        IRobot robot = factory.getRobotFromFactory("small");
        robot.print();

        for (int i = 0; i < 2; ++i) {
            robot = factory.getRobotFromFactory("small");
            robot.print();
        }
        System.out.println("distinct robots number created till now = " + factory.countTotalRobots());

        for (int i = 0; i < 5; ++i) {
            robot = factory.getRobotFromFactory("large");
            robot.print();
        }
        System.out.println("distinct robots number created till now = " + factory.countTotalRobots());
    }
}
