package com.orangetalents.zup.contoller;

import com.orangetalents.zup.contoller.helper.UserRequest;
import com.orangetalents.zup.entity.User;
import com.orangetalents.zup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    List<User> getAllUser(){
        return userService.userList();
    }

    @PostMapping("/user")
    User createUser(@RequestBody UserRequest body){
        return userService.createUser(body.getName(), body.getEmail(), body.getCpf(),
                body.getBirthdate(),body.getPassword());
    }
}
