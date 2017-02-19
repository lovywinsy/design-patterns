package edu.nwpu.rjwdz.decorator;

import org.junit.Test;

/**
 * Created by lovywinsy on 12/27/16.
 */
public class DecoratorTest {
    @Test
    public void decoratorEx() {
        System.out.println("This is a decorator pattern demo");
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());

        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());
    }
}
