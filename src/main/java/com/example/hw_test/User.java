package com.example.hw_test;

import lombok.Data;

@Data
public class User {
    private String emailUser;
    private String loginUser;

    public User(String emailUser, String loginUser) {
        this.emailUser = emailUser;
        this.loginUser = loginUser;
    }

    public User() {
    }
}


