package com.atuts.patterns.strategy;

/**
 * Console Ui used to get user input.
 *
 */
class UIConsole implements UI {
    private MessageService messageService;

    public UIConsole(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        messageService.send();
    }
}
