package com.li.springframework.beans.factory.support;


import com.li.springframework.beans.factory.config.BeanDefinition;

/**
 * Bean定义信息注册表的抽象接口，目前用户注册Bean的定义信息，供创建Bean时使用
 * 疑问？为什么注册表仅定义了注册行为，而没有定义获取行为
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
