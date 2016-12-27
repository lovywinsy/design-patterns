package edu.nwpu.rjwdz.proxy;

/**
 * Created by lovywinsy on 12/27/16.
 */
public class Proxy extends Subject {
    ConcreteSubject concreteSubject;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");
        // Lazy initialization.
        if (null == concreteSubject) {
            concreteSubject = new ConcreteSubject();
        }
        concreteSubject.doSomeWork();
    }
}
