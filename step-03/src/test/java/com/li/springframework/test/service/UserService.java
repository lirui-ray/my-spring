package com.li.springframework.test.service;

public class UserService {

    private String username;

    public UserService(String username) {
        this.username = username;
    }

    public void getUsers() {
        System.out.println("查询用户中..." + username);
    }

}
