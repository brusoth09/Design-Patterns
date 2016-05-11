package com.atuts.patterns.strategy;

/**
 * Class to handle email message sending.
 *
 */
class EmailMessagingSystem implements MessageService {
    /**
     * Send email
     *
     */
    public void send() {
        System.out.println("Getting senders");
        System.out.println("Getting Subject");
        System.out.println("Getting Body");
        System.out.print("Sending Mail");
    }
}
