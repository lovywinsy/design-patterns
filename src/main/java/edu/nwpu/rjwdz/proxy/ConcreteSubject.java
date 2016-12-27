package edu.nwpu.rjwdz.proxy;

/**
 * Created by lovywinsy on 12/27/16.
 */
public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("I am from concrete subject");
    }
}
