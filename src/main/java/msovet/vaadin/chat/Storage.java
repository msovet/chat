package msovet.vaadin.chat;

import lombok.Getter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Storage {
    @Getter
    private Queue<ChatMessage> messages = new ConcurrentLinkedQueue<>();

    @Getter
    public class ChatMessage{
        private String name;
        private String message;
    }
}
