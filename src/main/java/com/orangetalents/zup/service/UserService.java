package com.orangetalents.zup.service;

import com.orangetalents.zup.entity.User;
import com.orangetalents.zup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(String name, String email, String cpf, Date birthdate, String password) {
        User user = new User(name, email, cpf, birthdate, password);
        return userRepository.save(user);
    }
    public List<User> userList(){
        return userRepository.findAll();
    }
    public User getUserById(Long Id){
        return userRepository.findById(Id).orElseThrow();
    }
}
