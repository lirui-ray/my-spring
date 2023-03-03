package com.li.springframework.beans.factory.config;

/**
 * 单例bean注册表的抽象接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
