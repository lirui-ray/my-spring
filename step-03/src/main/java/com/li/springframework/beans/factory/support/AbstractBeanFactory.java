package com.li.springframework.beans.factory.support;


import com.li.springframework.beans.factory.BeanFactory;
import com.li.springframework.beans.factory.config.BeanDefinition;
import com.li.springframework.beans.factory.config.DeafultSingletonBeanRegistry;

public abstract class AbstractBeanFactory extends DeafultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) {
        return doGetBean(name, args);
    }

    public Object doGetBean(String name, Object... args) {
        Object bean = getSingleton(name);
        if (null != bean) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

}
