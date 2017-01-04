package edu.nwpu.rjwdz.adapter;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class Calculator {
    Rectangle rectangle;

    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.l * rectangle.w;
    }
}
