package com.li.springframework.beans.factory.config;

/**
 * Bean 的引用，目前用于标记Bean，在实例化时方便在容器中查找其对应的实例
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
