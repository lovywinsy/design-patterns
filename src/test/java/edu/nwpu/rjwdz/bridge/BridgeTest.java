package edu.nwpu.rjwdz.bridge;

import org.junit.Test;

/**
 * Created by lovywinsy on 2/6/17.
 */
public class BridgeTest {
    @Test
    public void BridgeEx() {
        System.out.println("This is a bridge pattern demo");
        System.out.println("\nColoring Triangle:");
        IColor green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        System.out.println("\nColoring Rectangle:");
        IColor red = new RedColor();
        Shape rectangle = new Rectangle(red);
        rectangle.drawShape(50);
        rectangle.modifyBorder(50, 2);
    }
}
