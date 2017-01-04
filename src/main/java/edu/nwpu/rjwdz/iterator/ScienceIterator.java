package edu.nwpu.rjwdz.iterator;

import java.util.LinkedList;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class ScienceIterator implements IIterator {
    private LinkedList<String> subjects;
    private int position;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void first() {
        position = 0;
    }

    public String next() {
        return subjects.get(position++);
    }

    public boolean isDone() {
        return position >= subjects.size();
    }

    public String currentItem() {
        return subjects.get(position);
    }
}
