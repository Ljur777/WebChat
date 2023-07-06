package com.example.webchat.controller;

import com.example.webchat.entity.User;
import com.example.webchat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users") //место, к которому обращаюсь
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userService.create(user); // добавляем клиента
        return new ResponseEntity<>(HttpStatus.CREATED); //возвращает статус- создано
    }

    @GetMapping(value= "/users")
    public ResponseEntity<List<User>> readAllUsers(){
        final List<User> users = userService.readAll(); //получаю всех клиентов
        return users != null && !users.isEmpty() //проверяю есть ли список и не пусто ли он
          ? new ResponseEntity<>(users, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}
