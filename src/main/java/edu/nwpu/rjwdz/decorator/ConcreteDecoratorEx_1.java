package edu.nwpu.rjwdz.decorator;

/**
 * Created by lovywinsy on 12/27/16.
 */
public class ConcreteDecoratorEx_1 extends AbstractDecorator {
    @Override
    public void doSomeWork() {
        super.doSomeWork();
        System.out.println("I am explicitly from Ex_1");
    }
}
