package com.example.webchat.repository;

import com.example.webchat.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepo {

        User save(User user);
        List<User> findAll();
        Optional<User> findById(Integer id);
    }

