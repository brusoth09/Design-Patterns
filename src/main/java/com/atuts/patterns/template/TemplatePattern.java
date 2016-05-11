package com.atuts.patterns.template;

import com.atuts.main.DesignPattern;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Class to test template design pattern.
 *
 */
public class TemplatePattern implements DesignPattern{
    public void testPattern() {
        UI ui = new ConsoleUI();
        Login login = new SimpleLogin();

        MessagingSystem smsMessagingSystem = new SmsMessagingSystem(ui);
        MessagingSystem emailMessagingSystem = new EmailMessagingSystem(ui, login);

        MessagingSystemSelector selector = new MessagingSystemSelector(Arrays.asList(smsMessagingSystem, emailMessagingSystem));

        System.out.println("Select preferred way of sending message ("+selector.getAllMessagingSystem()+") :");
        String input = (new Scanner(System.in)).nextLine();

        MessagingSystem system = selector.selectMessagingSystem(input.trim());

        if(system != null){
            system.sendMessage();
        } else {
            System.out.println("Wrong Choice");
        }
    }
}
