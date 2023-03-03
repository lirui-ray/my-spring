package com.li.springframework.beans.factory.config;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认单例bean注册表，用于存储单例bean
 */
public class DeafultSingletonBeanRegistry implements SingletonBeanRegistry{

    private Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 实例化前会在此获取若存在则不再进行实例化
     * @param beanName
     * @return
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 若未进行实例化，单例注册表中不会存在bean的信息，需要将bean添加至注册表中
     * @param beanName
     * @param singletonObject
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
