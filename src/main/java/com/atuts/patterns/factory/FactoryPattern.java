package com.atuts.patterns.factory;

import com.atuts.main.DesignPattern;

import java.util.Optional;
import java.util.Scanner;

/**
 * Factory design pattern examples.
 *
 */
public class FactoryPattern implements DesignPattern{
    public void testPattern() {
        System.out.print("Please enter preferred messaging system (sms):");
        String preference = (new Scanner(System.in)).nextLine();

        MessagingSystemFactory factory = new MessagingSystemFactory();
        Optional<? extends MessagingSystem> messagingSystem = factory.getMessagingSystem(preference);
        if(messagingSystem.isPresent()){
            messagingSystem.get().sendMessage();
        } else {
            System.out.println("Invalid input");
        }
    }
}
