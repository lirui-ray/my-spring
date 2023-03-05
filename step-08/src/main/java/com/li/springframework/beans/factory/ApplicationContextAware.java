package com.li.springframework.beans.factory;

import com.li.springframework.beans.BeansException;
import com.li.springframework.context.ApplicationContext;

/**
 * 能感知到所属的ApplicationContext
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
