package com.lispringframework.beans.factory.support;

import com.lispringframework.beans.BeansException;
import com.lispringframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 作者：Lee
 * <p>
 * Bean 实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
