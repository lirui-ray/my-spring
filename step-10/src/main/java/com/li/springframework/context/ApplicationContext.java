package com.li.springframework.context;

import com.li.springframework.beans.factory.HierarchicalBeanFactory;
import com.li.springframework.beans.factory.ListableBeanFactory;
import com.li.springframework.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
