package com.li.springframework.context.support;

import com.li.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.li.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Convenient base class for {@link com.li.springframework.context.ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link com.li.springframework.beans.factory.xml.XmlBeanDefinitionReader}.
 *
 *
 *
 *
 *
 *
 * 作者：Lee
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
