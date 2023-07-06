package com.example.webchat.dto.message;

import com.example.webchat.core.validation.InfoMessage;
import com.example.webchat.entity.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FindMessageForAdmin {
  private List<Message> messages;
  private List<InfoMessage> infos;
}
