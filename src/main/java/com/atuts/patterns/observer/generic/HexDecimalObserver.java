package com.atuts.patterns.observer.generic;

/**
 * Convert to hexa decimal change
 *
 */
class HexDecimalObserver implements Observer{
    public HexDecimalObserver(Subject subject) {
        subject.addObserver(this);
    }

    public void getState(int state) {
        System.out.println(Integer.toHexString(state));
    }
}
