package com.li.springframework.beans.test.bean;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class UserService {

    private String username;

    public UserService(String username) {
        this.username = username;
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息");
    }

}
