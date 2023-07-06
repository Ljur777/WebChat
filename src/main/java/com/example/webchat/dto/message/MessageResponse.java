package com.example.webchat.dto.message;

import com.example.webchat.core.validation.InfoMessage;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
public class MessageResponse {
    private Integer id;
    private String textMessage;
    private LocalDateTime creationTime;
    private List<InfoMessage> infos;
}
