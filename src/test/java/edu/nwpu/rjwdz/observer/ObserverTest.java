package edu.nwpu.rjwdz.observer;

import org.junit.Test;

/**
 * Created by lovywinsy on 2016/12/25.
 */
public class ObserverTest {
    @Test
    public void observerEx() {
        System.out.println("This is a observer pattern demo");

        Observer observer = new Observer();
        Subject subject = new Subject();
        subject.register(observer);
        System.out.println("Setting flag = 5");
        subject.setFlag(5);
        System.out.println("Setting flag = 25");
        subject.setFlag(25);

        // No notification this time to observer, since it is unregistered.
        subject.unregister(observer);
        System.out.println("Setting flag = 50");
        subject.setFlag(50);
    }
}
