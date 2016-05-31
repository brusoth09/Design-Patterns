package com.atuts.patterns.chain_of_responsibility;

import com.atuts.main.DesignPattern;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Chain of Responsibility design pattern demo
 */
public class CORDesignPattern implements DesignPattern{
    private static final Logger LOGGER = Logger.getLogger(CORDesignPattern.class.getName());

    public void testPattern() {
        Scanner scanner = new Scanner(System.in);
        ATMService simpleATMService = new SimpleATMService();
        boolean more = true;
        while(more) {
            System.out.print("Please enter the amount you want to change: ");
            String input = scanner.nextLine();
            try {
                simpleATMService.changeCash(Double.parseDouble(input));
            } catch (NumberFormatException ex){
                LOGGER.info("Please insert a cash value without symbol");
            }
            System.out.print("Do you want to continue (y/n):");
            if(!(scanner.nextLine()).equalsIgnoreCase("y")){
                more = false;
            }
        }

    }
}
