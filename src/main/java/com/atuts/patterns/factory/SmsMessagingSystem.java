package com.atuts.patterns.factory;

/**
 *
 */
class SmsMessagingSystem implements MessagingSystem {
    public void sendMessage() {
        System.out.println("sending SMS....");
    }
}
