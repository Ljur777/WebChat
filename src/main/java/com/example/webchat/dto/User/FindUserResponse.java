package com.example.webchat.dto.User;

import com.example.webchat.core.validation.InfoMessage;
import com.example.webchat.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class FindUserResponse {
    private List<User> users;
  private List<InfoMessage> infos;
}
