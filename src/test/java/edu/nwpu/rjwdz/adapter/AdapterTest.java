package edu.nwpu.rjwdz.adapter;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class AdapterTest {
    @Test
    public void adapterEx() {
        System.out.println("This is a adapter pattern demo");
        CalculatorAdapter adapter = new CalculatorAdapter();
        Triangle t = new Triangle(20, 10);
        System.out.println("Area of Triangle is: " + adapter.getArea(t));
    }
}
