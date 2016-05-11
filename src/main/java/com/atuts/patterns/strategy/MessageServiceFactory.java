package com.atuts.patterns.strategy;

/**
 * Factory design pattern to get preferred instance of message service.
 *
 */
class MessageServiceFactory {

    /**
     * Method return message service instance based on input
     * Example "sms" returns new SmsMessagingSystem
     * @param preference preferred way of sending message
     * @return new preferred instance of message service
     */
    public static MessageService getMessageService(String preference) {
        if(preference == null){
            return null;
        }

        if(preference.equalsIgnoreCase("sms")){
            return new SmsMessagingSystem();
        } else if (preference.equalsIgnoreCase("email")){
            return new EmailMessagingSystem();
        }

        return null;
    }
}
