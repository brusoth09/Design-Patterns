package com.atuts.patterns.chain_of_responsibility;

/**
 * Simple ATM Service
 */
public class SimpleATMService implements ATMService {
    private final Money thousandRuppe;

    public SimpleATMService() {
        Money hundredRupee = new HundredRupeeMoney(null);
        Money fiveHundredRuppe = new FiveHundredRuppeMoney(hundredRupee);
        thousandRuppe = new ThousandRupeeMoney(fiveHundredRuppe);

    }

    public void changeCash(double amount) {
        thousandRuppe.change(amount);
    }
}
