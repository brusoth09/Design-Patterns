package com.atuts.patterns.chain_of_responsibility;

/**
 *
 */
public class ThousandRupeeMoney extends Money {

    public ThousandRupeeMoney(Money successor) {
        super(successor);
    }

    @Override
    double getValue() {
        return 1000;
    }
}
