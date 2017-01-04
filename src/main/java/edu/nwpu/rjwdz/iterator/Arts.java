package edu.nwpu.rjwdz.iterator;

/**
 * Created by lovywinsy on 2017/1/4.
 */
public class Arts implements ISubject {
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    public IIterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
