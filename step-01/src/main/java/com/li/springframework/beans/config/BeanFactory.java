package com.li.springframework.beans.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    /**
     * 有并发问题，需要用ConcurrentHashMap
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

}
