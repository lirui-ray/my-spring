package com.li.springframework.context.support;

import com.li.springframework.beans.BeansException;
import com.li.springframework.beans.factory.ApplicationContextAware;
import com.li.springframework.beans.factory.config.BeanPostProcessor;
import com.li.springframework.context.ApplicationContext;

/**
 * 作者：Lee
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
