package com.example.webchat.dto.message;
import com.example.webchat.core.validation.InfoMessage;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FindMessageForUser {
   private List<MessageForUser> messages;
   private List<InfoMessage> infos;
}
