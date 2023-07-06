package com.example.webchat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Integer id;
    private String nickName;
    private LocalDateTime creationDate;
    private LocalDateTime lastVisit;
}
