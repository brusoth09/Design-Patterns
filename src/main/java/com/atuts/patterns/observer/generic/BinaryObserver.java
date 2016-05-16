package com.atuts.patterns.observer.generic;

/**
 * Convert to binary value
 *
 */
class BinaryObserver implements Observer{

    public BinaryObserver(Subject subject) {
        subject.addObserver(this);
    }

    public void getState(int state) {
        System.out.println(Integer.toBinaryString(state));
    }
}
