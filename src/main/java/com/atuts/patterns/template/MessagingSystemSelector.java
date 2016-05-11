package com.atuts.patterns.template;

import java.util.List;

/**
 * Selector design Pattern to get selector
 *
 */
public class MessagingSystemSelector {
    private final List<MessagingSystem> messagingSystems;

    public MessagingSystemSelector(List<MessagingSystem> messagingSystems) {
        this.messagingSystems = messagingSystems;
    }


    public String getAllMessagingSystem() {
        StringBuilder result = new StringBuilder();
        for(MessagingSystem system : messagingSystems) {
            result.append(system.getType());
            result.append(",");
        }
        return result.length() > 0 ? result.substring(0, result.length() - 1): "";
    }

    public MessagingSystem selectMessagingSystem(String input) {
        for(MessagingSystem messagingSystem:messagingSystems){
            if(messagingSystem.getType().equalsIgnoreCase(input)){
                return messagingSystem;
            }
        }
        return null;
    }
}
