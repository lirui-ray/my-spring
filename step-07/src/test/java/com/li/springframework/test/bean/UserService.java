package com.li.springframework.test.bean;

import com.li.springframework.beans.factory.DisposableBean;
import com.li.springframework.beans.factory.InitializingBean;

/**
 * 作者：Lee
 */
public class UserService implements InitializingBean, DisposableBean {

    private String uId;
    private String company;
    private String location;

    private UserDao userDao;

    @Override
    public void destroy() throws Exception{
        System.out.println("执行：UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("执行：UserService.afterPropertiesSet");
    }

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
