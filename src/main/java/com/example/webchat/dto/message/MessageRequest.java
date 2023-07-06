package com.example.webchat.dto.message;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageRequest {
    private String textMessage;
    private String accessKey;
}
