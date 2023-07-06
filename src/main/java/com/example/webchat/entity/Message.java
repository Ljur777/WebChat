package com.example.webchat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private Integer id;
    private String textMessage;
    private LocalDateTime creationDate;
    private User messageAuthor;
}
