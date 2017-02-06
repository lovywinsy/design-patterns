package edu.nwpu.rjwdz.visitor;

import org.junit.Test;

/**
 * Created by lovywinsy on 2/6/17.
 */
public class VisitorTest {
    @Test
    public void visitorEx() {
        System.out.println("This is a visitor pattern demo");
        IVisitor visitor = new Visitor();
        MyClass myClass = new MyClass();
        myClass.accept(visitor);
    }
}
