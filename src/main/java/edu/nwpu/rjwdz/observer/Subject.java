package edu.nwpu.rjwdz.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lovywinsy on 2016/12/25.
 */
public class Subject implements ISubject {
    private List<Observer> observerList = new ArrayList<>();

    private int _flag;

    public int getFlag() {
        return _flag;
    }

    public void setFlag(int _flag) {
        this._flag = _flag;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }
}
