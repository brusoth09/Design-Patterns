package com.atuts.patterns.observer.java;

import java.util.Observable;


public class Subject extends Observable {

    private int state = 10;

    public void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }
}
