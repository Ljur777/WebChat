package com.example.webchat.repository;

import com.example.webchat.entity.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MessageRepoImpl implements MessageRepo{
    private Integer idCounter = 0;
    private List<Message> messageDB = new ArrayList<>();

    @Override
    public Message save(Message message) {
        message.setId(++idCounter);
        messageDB.add(message);
        return message;
    }

    @Override
    public List<Message> findAll() {
        return messageDB;
    }

    @Override
    public Optional<Message> findById(Integer id) {
        return messageDB.stream()
                .filter(msg -> msg.getId().equals(id))
                        .findFirst();
    }
}
