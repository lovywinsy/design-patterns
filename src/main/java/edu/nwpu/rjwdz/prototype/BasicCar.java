package edu.nwpu.rjwdz.prototype;

import java.util.Random;

/**
 * Created by lovywinsy on 1/17/17.
 */
public abstract class BasicCar implements Cloneable {
    public String modelName;
    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static int setPrice() {
        int price;
        price = new Random().nextInt(100000);
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
