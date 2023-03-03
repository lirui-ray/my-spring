package com.li.springframework.beans.service;

import com.li.springframework.beans.UserDao;

public class UserService {

    private String uId;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息: " + userDao.queryUsername(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

}
