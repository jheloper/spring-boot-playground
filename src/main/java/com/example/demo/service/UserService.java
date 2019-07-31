package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // org.springframework.beans.factory.NoUniqueBeanDefinitionException 발생
    // No qualifying bean of type 'com.example.demo.model.User' available: expected single matching bean but found 3: adminUser,commonUser,specialUser
    @Autowired
    private User user;

    public User getUser() {
        return this.user;
    }
}
