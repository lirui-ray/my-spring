package com.li.springframework.beans.config;

public class BeanDefinition {

    private Object bean;

    /**
     * 应当存储类信息，而非外部传入的创建实例，
     * @param bean
     */
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }

}
