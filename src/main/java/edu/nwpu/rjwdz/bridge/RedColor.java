package edu.nwpu.rjwdz.bridge;

/**
 * Created by lovywinsy on 2/6/17.
 */
public class RedColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + "inch border");
    }
}
