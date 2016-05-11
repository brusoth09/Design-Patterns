package com.atuts.patterns.template;

/**
 * Simeple interface enforce messaging system.
 *
 */
abstract class MessagingSystem {
    public abstract String getType();

    public void sendMessage(){
        login();
        getRecipients();
        getSubject();
        getBody();
        send();
        getDeliveryReport();
    }

    protected abstract void getDeliveryReport();

    protected abstract void send();

    protected abstract void getBody();

    protected abstract void getSubject();

    protected abstract void login();

    protected abstract void getRecipients();



}
