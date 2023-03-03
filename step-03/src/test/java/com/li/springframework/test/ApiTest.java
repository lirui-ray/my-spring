package com.li.springframework.test;

import com.li.springframework.beans.factory.config.BeanDefinition;
import com.li.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.li.springframework.test.service.UserService;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注入
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取
        UserService userService = (UserService) beanFactory.getBean("userService", "张三");
        userService.getUsers();
    }

}
