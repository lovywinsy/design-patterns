package edu.nwpu.rjwdz.iterator;

import java.util.LinkedList;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class Science implements ISubject {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Maths");
        subjects.addLast("Computer");
        subjects.addLast("Physics");
    }

    public IIterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
