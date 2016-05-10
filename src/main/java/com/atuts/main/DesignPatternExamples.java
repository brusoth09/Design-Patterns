package com.atuts.main;

import com.atuts.patterns.strategy.MessageService;
import com.atuts.patterns.strategy.MessageServiceFactory;
import com.atuts.patterns.strategy.UI;
import com.atuts.patterns.strategy.UIConsole;

import java.util.Scanner;

/**
 * Explains Each and every design patterns
 *
 */
public class DesignPatternExamples {
    public static void main(String[] args) {
        DesignPatternExamples examples = new DesignPatternExamples();
        examples.showStrategyDesignPattern();
    }

    /**
     * Call Strategy Pattern
     *
     */
    private void showStrategyDesignPattern() {
        System.out.print("Please enter preferred messaging system (sms,email):");
        String preference = (new Scanner(System.in)).nextLine();
        MessageService messageService = MessageServiceFactory.getMessageService(preference);

        UI userInterface = new UIConsole(messageService);
        userInterface.sendMessage();
    }
}
