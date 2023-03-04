package com.li.springframework.test;

import com.li.springframework.test.common.MyBeanFactoryPostProcessor;
import com.li.springframework.test.common.MyBeanPostProcessor;
import com.li.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.li.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.li.springframework.context.support.ClassPathXmlApplicationContext;
import com.li.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 作者：Lee
 */
public class ApiTest {

    @Test
    public void testBeanFactoryPostProcessorAndBeanPostProcessor() {
        // 1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 3.BeanDefinition 加载完成&Bean实例化之前，修改BeanDefiniton的属性
        MyBeanFactoryPostProcessor beanFactoryProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryProcessor.postProcessBeanFactory(beanFactory);

        // 4.Bean实例化之后，修改Bean属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        // 5.获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void textXml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");

        // 2.获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println(result);
    }

}
