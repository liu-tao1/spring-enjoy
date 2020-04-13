package com.enjoy.example.cap10.listeners;

import com.enjoy.example.cap10.event.AbstractContextEvent;

/**
 * 容器监听器接口，被所有的具体容器监听器类实现
 *
 * @author liutao
 * @since 2020/4/10
 */
public interface ContextListener<T extends AbstractContextEvent> extends EventListener {
    /**
     * Handle an application event.
     * 
     * @param event the event to respond to
     */
    void onApplicationEvent(T event);
}
