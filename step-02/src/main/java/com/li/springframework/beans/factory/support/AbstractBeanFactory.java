package com.li.springframework.beans.factory.support;

import com.li.springframework.beans.factory.config.BeanDefinition;
import com.li.springframework.beans.factory.BeanFactory;
import com.li.springframework.beans.factory.config.DeafultSingletonBeanRegistry;

public abstract class AbstractBeanFactory extends DeafultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (null != bean) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

}
