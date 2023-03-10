package com.li.springframework.test.common;

import com.li.springframework.beans.BeansException;
import com.li.springframework.beans.PropertyValue;
import com.li.springframework.beans.PropertyValues;
import com.li.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.li.springframework.beans.factory.config.BeanDefinition;
import com.li.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
