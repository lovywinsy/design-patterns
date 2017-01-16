package edu.nwpu.rjwdz.builder;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/15.
 */
public class BuilderTest {
    @Test
    public void builderEx() {
        System.out.println("This is a builder pattern demo");
        Director director = new Director();

        IBuilder carBuilder = new Car();
        IBuilder motorBuilder = new MotorCycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }
}
