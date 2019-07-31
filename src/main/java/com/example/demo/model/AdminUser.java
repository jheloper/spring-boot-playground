package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class AdminUser implements User {

    @Override
    public String printMyUserType() {
        return "It's Admin User.";
    }
}
