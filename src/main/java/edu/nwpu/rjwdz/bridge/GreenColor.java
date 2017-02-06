package edu.nwpu.rjwdz.bridge;

/**
 * Created by lovywinsy on 2/6/17.
 */
public class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green Color with " + border + " inch border");
    }
}
