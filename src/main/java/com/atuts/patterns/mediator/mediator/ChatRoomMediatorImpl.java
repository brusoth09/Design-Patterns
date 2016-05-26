package com.atuts.patterns.mediator.mediator;


import com.atuts.patterns.mediator.langugae.LanguageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of Chat Room Mediator
 *
 */
class ChatRoomMediatorImpl implements ChatRoomMediator {
    private final List<User> users;
    private LanguageFactory factory = new LanguageFactory();

    public ChatRoomMediatorImpl() {
        this.users = new ArrayList();
    }

    public void sendMessage(String msg, User user) {
        for(User u:users){
            if(u != user){
                u.receive(factory.getLanguageProcessor(user.getLang(),u.getLang()).convert(msg));
            }
        }
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
