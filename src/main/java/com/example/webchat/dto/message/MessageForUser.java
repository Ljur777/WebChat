package com.example.webchat.dto.message;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class MessageForUser {
    private Integer id;
    private String textMessage;
    private LocalDateTime creationTime;
    private String userName;
}
