package edu.nwpu.rjwdz.iterator;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class ArtsIterator implements IIterator {
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
    }

    public void first() {
        position = 0;
    }

    public String next() {
        return subjects[position++];
    }

    public boolean isDone() {
        return position >= subjects.length;
    }

    public String currentItem() {
        return subjects[position];
    }
}
