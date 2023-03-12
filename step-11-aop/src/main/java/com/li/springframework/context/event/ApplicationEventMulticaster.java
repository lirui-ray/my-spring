package com.li.springframework.context.event;

import com.li.springframework.context.ApplicationEvent;
import com.li.springframework.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);

}
