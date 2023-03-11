package com.li.springframework.test;

import com.li.springframework.context.support.ClassPathXmlApplicationContext;
import com.li.springframework.test.event.CustomEvent;
import org.junit.Test;

/**
 * 作者：Lee
 */
public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}
