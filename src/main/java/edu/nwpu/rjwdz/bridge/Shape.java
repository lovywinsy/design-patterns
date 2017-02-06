package edu.nwpu.rjwdz.bridge;

/**
 * Created by lovywinsy on 2/6/17.
 */
public abstract class Shape {
    protected IColor color;

    protected Shape(IColor c) {
        this.color = c;
    }

    abstract void drawShape(int border);

    abstract void modifyBorder(int border, int increment);
}
