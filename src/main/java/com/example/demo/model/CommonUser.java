package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CommonUser implements User {

    @Override
    public String printMyUserType() {
        return "It's Common User.";
    }
}
