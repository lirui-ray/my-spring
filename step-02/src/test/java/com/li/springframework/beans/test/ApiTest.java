package com.li.springframework.beans.test;

import com.li.springframework.beans.factory.config.BeanDefinition;
import com.li.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.li.springframework.beans.test.bean.UserService;
import org.junit.jupiter.api.Test;

/**
 * 作者：Lee
 * 实现Bean的定义注册和获取
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
    }

}
