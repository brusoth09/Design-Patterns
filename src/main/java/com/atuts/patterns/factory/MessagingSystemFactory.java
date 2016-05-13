package com.atuts.patterns.factory;

import java.util.Optional;

/**
 * Factory class to get messaging system instance
 *
 */
class MessagingSystemFactory {
    public Optional<? extends MessagingSystem> getMessagingSystem(String sms) {
        if(sms.equalsIgnoreCase("sms")){
            SmsMessagingSystem smsMessagingSystem = new SmsMessagingSystem();
            return Optional.of(smsMessagingSystem);
        }
        return Optional.empty();
    }
}
