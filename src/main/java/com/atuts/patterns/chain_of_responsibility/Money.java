package com.atuts.patterns.chain_of_responsibility;

/**
 * Money interface
 *
 */
public abstract class Money {
    private Money successor;

    public Money(Money successor) {
        this.successor = successor;
    }

    abstract double getValue();

    public void change(double amount) {
        int notes = (int)(amount/getValue());
        if( notes > 0){
            System.out.println(notes + " Notes of " +getValue()+" Rupees" );
        }
        double balance = amount % getValue();
        if(successor != null) {
            if (balance > 0) {
                successor.change(balance);
            }
        } else {
            System.out.println("you can't get this amount");
        }
    }
}
