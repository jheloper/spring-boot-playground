package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class SpecialUser implements User {

    @Override
    public String printMyUserType() {
        return "It's Special User.";
    }
}
