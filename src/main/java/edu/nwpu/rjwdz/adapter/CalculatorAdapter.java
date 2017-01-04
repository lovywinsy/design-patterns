package edu.nwpu.rjwdz.adapter;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle t) {
        calculator = new Calculator();
        triangle = t;
        Rectangle r = new Rectangle();
        r.l = triangle.b;
        r.w = 0.5 * triangle.h;
        return calculator.getArea(r);
    }
}
