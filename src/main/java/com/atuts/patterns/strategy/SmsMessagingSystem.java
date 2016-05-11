package com.atuts.patterns.strategy;

/**
 * Sms message system to send sms
 *
 */
class SmsMessagingSystem implements MessageService {

    /**
     * Send sms messages
     *
     */
    public void send() {
        System.out.println("Getting Recipients Details");
        System.out.println("Sending SMS");
        System.out.print("Getting Delivery Report");
    }
}
