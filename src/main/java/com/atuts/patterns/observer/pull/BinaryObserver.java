package com.atuts.patterns.observer.pull;

/**
 * Convert to binary value
 *
 */
class BinaryObserver implements Observer {

    public BinaryObserver(Subject subject) {
        subject.addObserver(this);
    }

    public void getState() {
        System.out.println("There is a update in state");
    }

    public void getValue(int value) {
        System.out.println(Integer.toBinaryString(value));
    }
}
