package edu.nwpu.rjwdz.iterator;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class IteratorTest {
    @Test
    public void iteratorEx() {
        System.out.println("This is a iterator pattern demo");
        ISubject scSubject = new Science();
        ISubject arSubject = new Arts();

        IIterator scIterator = scSubject.createIterator();
        IIterator arIterator = arSubject.createIterator();

        print(scIterator);
        print(arIterator);
    }

    public void print(IIterator iIterator) {
        while (!iIterator.isDone()) {
            System.out.println(iIterator.next());
        }
    }
}
