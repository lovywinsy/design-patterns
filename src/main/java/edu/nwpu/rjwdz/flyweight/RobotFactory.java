package edu.nwpu.rjwdz.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lovywinsy on 2017/1/15.
 */
public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<>();

    public int countTotalRobots() {
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String category) throws Exception {
        IRobot robot = null;
        if (shapes.containsKey(category)) {
            robot = shapes.get(category);
        } else {
            switch (category) {
                case "small":
                    System.out.println("creating a small robot now");
                    robot = new SmallRobot();
                    shapes.put("small", robot);
                    break;
                case "large":
                    System.out.println("creating a large robot now");
                    robot = new LargeRobot();
                    shapes.put("large", robot);
                    break;
                default:
                    throw new Exception("robot factory can create only small and large shapes");
            }
        }
        return robot;
    }
}
