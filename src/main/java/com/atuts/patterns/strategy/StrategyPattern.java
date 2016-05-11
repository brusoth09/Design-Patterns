package com.atuts.patterns.strategy;

import com.atuts.main.DesignPattern;

import java.util.Scanner;

/**
 * Created by brusoth on 5/11/16.
 */
public class StrategyPattern implements DesignPattern {

    public void testPattern() {
        System.out.print("Please enter preferred messaging system (sms,email):");
        String preference = (new Scanner(System.in)).nextLine();
        MessageService messageService = MessageServiceFactory.getMessageService(preference);

        UI userInterface = new UIConsole(messageService);
        userInterface.sendMessage();
    }
}
