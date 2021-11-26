package msovet.vaadin.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Storage {
    @Getter
    private Queue<ChatMessage> messages = new ConcurrentLinkedQueue<>();

    public void addRecord(String user, String message) {
        messages.add(new ChatMessage(user, message));
    }

    @Getter
    @AllArgsConstructor
    public class ChatMessage{
        private String name;
        private String message;
    }
}
