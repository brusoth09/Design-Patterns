package com.atuts.patterns.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable subject
 *
 */
class Subject {
    private List<Observer> observerList = new ArrayList();

    private int state = 10;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer:observerList){
            observer.getState();
            //observer.getValue(state);
        }
    }
}
