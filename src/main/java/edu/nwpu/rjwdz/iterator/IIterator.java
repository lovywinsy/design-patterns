package edu.nwpu.rjwdz.iterator;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public interface IIterator {
    void first();

    String next();

    boolean isDone();

    String currentItem();
}
