package com.li.springframework.beans;

import com.li.springframework.beans.service.UserService;
import com.li.springframework.beans.PropertyValue;
import com.li.springframework.beans.PropertyValues;
import com.li.springframework.beans.factory.xml.config.BeanDefinition;
import com.li.springframework.beans.factory.xml.config.BeanReference;
import com.li.springframework.beans.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // UserDao注册以备下面注册service时注入使用
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 注册service
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
