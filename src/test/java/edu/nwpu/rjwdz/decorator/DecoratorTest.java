package edu.nwpu.rjwdz.decorator;

import org.junit.Test;

/**
 * Created by lovywinsy on 12/27/16.
 */
public class DecoratorTest {
    @Test
    public void decoratorEx() {
        System.out.println("This is a decorator pattern demo");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
        cd_1.setComponent(cc);
        cd_1.doSomeWork();

        ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();
        cd_2.setComponent(cc);
        cd_2.doSomeWork();
    }
}
