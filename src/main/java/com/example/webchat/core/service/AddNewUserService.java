package com.example.webchat.core.service;

import com.example.webchat.dto.User.UserRequest;
import com.example.webchat.dto.User.UserResponse;
import com.example.webchat.entity.User;
import com.example.webchat.repository.UserRepoImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.example.webchat.dto.User.UserResponse;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AddNewUserService {
    private final UserRepoImpl userRepo;
    public UserResponse addNewUserRequest(UserRequest userRequest){
        //create new user
        User newUser = new User();
        newUser.setNickName(userRequest.getName());

        newUser.setLastVisit(LocalDateTime.now());
        newUser =  userRepo.save(newUser); //save our user
        UserResponse response = new UserResponse();
        response.setId(newUser.getId());
        response.setName(newUser.getNickName());
        //add list of validation

        return response;
    }

}
