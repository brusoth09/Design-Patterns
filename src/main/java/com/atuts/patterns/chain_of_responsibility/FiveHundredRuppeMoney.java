package com.atuts.patterns.chain_of_responsibility;

/**
 *
 */
public class FiveHundredRuppeMoney extends Money {
    public FiveHundredRuppeMoney(Money hundredRupee) {
        super(hundredRupee);
    }

    @Override
    double getValue() {
        return 500;
    }
}
