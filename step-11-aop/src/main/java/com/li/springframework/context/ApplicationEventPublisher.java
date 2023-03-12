package com.li.springframework.context;

/**
 * Interface that encapsulates event publication functionality.
 * Serves as super-interface for ApplicationContext.
 *
 * 事件发布者接口
 *      定义了一个发布事件的方法，所有的事件都将通过这一方法进行发布
 * 作者：Lee
 */
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);

}
