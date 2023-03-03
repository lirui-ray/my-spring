package com.li.springframework.beans.test;

import com.li.springframework.beans.config.BeanFactory;
import com.li.springframework.beans.test.bean.UserSerivce;
import com.li.springframework.beans.config.BeanDefinition;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    void testBeanFactory() {
        // 初始化工厂
        BeanFactory beanFactory = new BeanFactory();

        // 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserSerivce());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        UserSerivce userService = (UserSerivce) beanFactory.getBean("userService");
        userService.getUser();
    }

}
