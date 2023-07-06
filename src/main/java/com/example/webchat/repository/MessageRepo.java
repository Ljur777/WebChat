package com.example.webchat.repository;

import com.example.webchat.entity.Message;

import java.util.List;
import java.util.Optional;

public interface MessageRepo {
    Message save(Message message);
    List<Message> findAll();
    Optional<Message> findById(Integer id);
}
