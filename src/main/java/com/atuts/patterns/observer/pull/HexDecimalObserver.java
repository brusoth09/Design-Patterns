package com.atuts.patterns.observer.pull;

/**
 * Convert to hexa decimal change
 *
 */
class HexDecimalObserver implements Observer {
    public HexDecimalObserver(Subject subject) {
        subject.addObserver(this);
    }

    public void getState() {
        System.out.println("There is a update in state");
    }

    public void getValue(int value) {
        System.out.println(Integer.toHexString(value));
    }
}
