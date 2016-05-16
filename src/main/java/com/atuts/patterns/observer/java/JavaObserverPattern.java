package com.atuts.patterns.observer.java;

import com.atuts.main.DesignPattern;

/**
 * Use Java build in observer pattern
 *
 */
public class JavaObserverPattern implements DesignPattern{
    public void testPattern() {
        Subject subject = new Subject();
        subject.addObserver(new BinaryConverter());
        subject.addObserver(new HexDecimalObserver());

        subject.setState(20);
        subject.setState(30);
    }
}
