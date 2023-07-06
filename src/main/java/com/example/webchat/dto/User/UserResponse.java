package com.example.webchat.dto.User;

import com.example.webchat.core.validation.InfoMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Integer id;
    private String name; //имя
    private String accessKey;  //ключ доступа
    private List<InfoMessage> infos;


}
