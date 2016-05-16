package com.atuts.patterns.observer.pull;

/**
 *
 */
public class PullObserverPattern {
    public void testPattern(){
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexDecimalObserver(subject);

        subject.setState(15);
        subject.setState(40);
    }
}
