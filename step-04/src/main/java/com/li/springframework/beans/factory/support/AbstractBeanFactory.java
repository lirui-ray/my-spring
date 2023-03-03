package com.li.springframework.beans.factory.support;


import com.li.springframework.beans.factory.BeanFactory;
import com.li.springframework.beans.factory.config.BeanDefinition;
import com.li.springframework.beans.factory.config.DeafultSingletonBeanRegistry;

/**
 * 抽象bean工程
 *      1.是模板模式的抽象父类，其继承了注册表拥有了获取单例bean的能力
 *      2.自身仅实现了获取bean操作，由其子类实现创建Bean操作
 */
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
