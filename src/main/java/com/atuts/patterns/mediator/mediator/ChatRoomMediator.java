package com.atuts.patterns.mediator.mediator;

/**
 * Chat room mediator interface that define contract for concrete implementations.
 *
 */
interface ChatRoomMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
