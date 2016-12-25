package edu.nwpu.rjwdz.observer;

/**
 * Created by lovywinsy on 2016/12/25.
 */
public interface ISubject {
    void register(Observer o);

    void unregister(Observer o);

    void notifyObservers();
}
