package com.atuts.patterns.chain_of_responsibility;

/**
 *
 */
public class HundredRupeeMoney extends Money {
    public HundredRupeeMoney(Money successor) {
        super(successor);
    }

    @Override
    double getValue() {
        return 100;
    }
}
