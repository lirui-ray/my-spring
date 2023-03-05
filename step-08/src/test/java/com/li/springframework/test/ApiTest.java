package com.li.springframework.test;

import com.li.springframework.context.support.ClassPathXmlApplicationContext;
import com.li.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 作者：Lee
 */
public class ApiTest {

    @Test
    public void textXml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
        System.out.println("ApplicationContextAware：" + userService.getApplicationContext());
        System.out.println("BeanFactoryAware：" + userService.getBeanFactory());
    }

}
