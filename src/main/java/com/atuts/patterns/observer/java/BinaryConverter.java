package com.atuts.patterns.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Binary observer
 */
public class BinaryConverter implements Observer {
    public void update(Observable o, Object arg) {
        if(o instanceof Subject){
            convertToBinary((Integer) arg);
        }
    }

    private void convertToBinary(int state){
        System.out.println(Integer.toBinaryString(state));
    }
}
