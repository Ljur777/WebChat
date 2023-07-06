package com.example.webchat.repository;

import com.example.webchat.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepoImpl implements UserRepo{
    private Integer idCounter = 0;
    private List<User> userDB = new ArrayList<>();


    @Override
    public User save(User user) {
        user.setId(++idCounter);//первый юзер сразу получит ид 1
        userDB.add(user); //добавила в репо юзера
        return user;
    }

    @Override
    public List<User> findAll() {
        return userDB;
    }

    @Override
    public Optional<User> findById(Integer id) {
        //перебираем в базе юзеров, и если совпадают ид - показываем их
        return userDB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
}
