package com.atuts.patterns.strategy;

/**
 * Created by brusoth on 5/10/16.
 */
public class EmailMessagingSystem implements MessageService {
    public void send() {
        System.out.println("Getting senders");
        System.out.println("Getting Subject");
        System.out.println("Getting Body");
        System.out.print("Sending Mail");
    }
}
