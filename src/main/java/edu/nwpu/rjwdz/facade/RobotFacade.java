package edu.nwpu.rjwdz.facade;

/**
 * Created by lovywinsy on 1/5/17.
 */
public class RobotFacade {
    RobotBody body;
    RobotColor color;
    RobotMetal metal;

    public RobotFacade() {
        body = new RobotBody();
        color = new RobotColor();
        metal = new RobotMetal();
    }

    public void constructRobot(String c, String m) {
        System.out.println("Creation start");
        color.setColor(c);
        metal.setMetal(m);
        body.createBody();
        System.out.println("Creation end");
    }
}
