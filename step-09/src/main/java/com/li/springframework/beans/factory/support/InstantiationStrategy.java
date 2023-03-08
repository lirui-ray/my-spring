package com.li.springframework.beans.factory.support;

import com.li.springframework.beans.BeansException;
import com.li.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 作者：Lee
 * <p>
 * Bean 实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
