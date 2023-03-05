package com.li.springframework.beans.factory.support;

import com.li.springframework.beans.BeansException;
import com.li.springframework.core.io.Resource;
import com.li.springframework.core.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 *
 *
 *
 *
 *
 *
 * 作者：Lee
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
