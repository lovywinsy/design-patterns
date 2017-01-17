package edu.nwpu.rjwdz.prototype;

import org.junit.Test;

/**
 * Created by lovywinsy on 1/17/17.
 */
public class ProtoTypeTest {
    @Test
    public void protoTypeEx() throws CloneNotSupportedException {
        System.out.println("This is a prototype pattern demo");
        BasicCar nanoBase = new Nano("Green Nano");
        nanoBase.price = 100000;

        BasicCar fordBase = new Ford("Yellow Ford");
        fordBase.price = 500000;

        BasicCar bc1;
        bc1 = nanoBase.clone();
        bc1.price = nanoBase.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price is Rs." + bc1.price);

        bc1 = fordBase.clone();
        bc1.price = fordBase.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price is Rs." + bc1.price);
    }
}
