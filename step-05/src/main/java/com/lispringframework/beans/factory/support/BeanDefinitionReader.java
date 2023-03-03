package com.lispringframework.beans.factory.support;

import com.lispringframework.beans.BeansException;
import com.lispringframework.core.io.Resource;
import com.lispringframework.core.io.ResourceLoader;

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

}
