package com.atuts.patterns.template;

/**
 * SMS messaging system responsible for sending sms
 *
 */
class SmsMessagingSystem extends MessagingSystem {
    public SmsMessagingSystem(UI ui) {

    }

    @Override
    public String getType() {
        return "sms";
    }

    @Override
    protected void getDeliveryReport() {
        System.out.println("Getting Delivery Report");
    }

    @Override
    protected void send() {
        System.out.println("Sending SMS");
    }

    @Override
    protected void getBody() {
        System.out.println("Getting Message");
    }

    @Override
    protected void getSubject() {

    }

    @Override
    protected void login() {

    }

    @Override
    protected void getRecipients() {
        System.out.println("Getting Recipients");
    }
}
