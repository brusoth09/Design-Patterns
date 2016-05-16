package com.atuts.patterns.observer.generic;

/**
 * Class to test observer pattern
 *
 */
public class GenericObserverPattern {
    public void testPattern(){
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexDecimalObserver(subject);

        subject.setState(15);
        subject.setState(30);
    }
}
