package com.example.webchat.service;

import com.example.webchat.entity.User;

import java.util.List;

public interface UserService {
    void create(User user);
    List<User> readAll();
    User readUser(int id);
    boolean update(User user, int id);
    boolean deleteById(int id);

}
