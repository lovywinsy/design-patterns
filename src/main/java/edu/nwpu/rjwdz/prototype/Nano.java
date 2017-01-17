package edu.nwpu.rjwdz.prototype;

/**
 * Created by lovywinsy on 1/17/17.
 */
public class Nano extends BasicCar {
    public Nano(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
