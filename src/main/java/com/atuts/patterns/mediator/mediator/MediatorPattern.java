package com.atuts.patterns.mediator.mediator;


import com.atuts.main.DesignPattern;
import com.atuts.patterns.mediator.langugae.Language;

/**
 * Chat room client main method to execute chat room.
 *
 */
public class MediatorPattern implements DesignPattern{

    public void testPattern() {
        ChatRoomMediator mediator = new ChatRoomMediatorImpl();

        User user1 = new UserImpl(mediator,"Peter", Language.ENGLISH);
        User user2 = new UserImpl(mediator,"Kevin",Language.FRENCH);

        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hi All");
        user2.send("salut à tous");
    }
}
