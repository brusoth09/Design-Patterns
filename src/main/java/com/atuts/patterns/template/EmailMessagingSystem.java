package com.atuts.patterns.template;

/**
 * Created by brusoth on 5/11/16.
 */
public class EmailMessagingSystem extends MessagingSystem {
    public EmailMessagingSystem(UI ui, Login login) {
        super();
    }

    @Override
    public String getType() {
        return "email";
    }

    @Override
    protected void getDeliveryReport() {
        System.out.println("Getting Delivery Report");
    }

    @Override
    protected void send() {
        System.out.println("Sending Message");
    }

    @Override
    protected void getBody() {
        System.out.println("Getting Body");
    }

    @Override
    protected void getSubject() {
        System.out.println("Adding Subject");
    }

    @Override
    protected void login() {
        System.out.println("Login Module");
    }

    @Override
    protected void getRecipients() {
        System.out.println("Adding contacts");
    }
}
