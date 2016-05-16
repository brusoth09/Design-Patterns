package com.atuts.patterns.observer.java;


import java.util.Observable;
import java.util.Observer;

/**
 * Convert to hexa decimal change
 *
 */
class HexDecimalObserver implements Observer{

    public void update(Observable o, Object arg) {
        if(o instanceof Subject){
            convertToHex((Integer) arg);
        }
    }

    private void convertToHex(Integer arg) {
        System.out.println(Integer.toHexString(arg));
    }
}
