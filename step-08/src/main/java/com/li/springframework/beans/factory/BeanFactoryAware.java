package com.li.springframework.beans.factory;

import com.li.springframework.beans.BeansException;

/**
 * 实现此可口即能感知到所属的BeanFactory
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
