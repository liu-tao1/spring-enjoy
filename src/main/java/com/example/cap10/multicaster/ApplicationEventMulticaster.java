package com.example.cap10.multicaster;

import com.example.cap10.event.AbstractContextEvent;
import com.example.cap10.listeners.ContextListener;

/**
 * 事件发布器接口
 *
 * @author liutao
 * @since 2020/4/10
 */
public interface ApplicationEventMulticaster {
    void addContextListener(ContextListener<?> listener);

    void removeContextListener(ContextListener<?> listener);

    void removeAllListeners();

    void multicastEvent(AbstractContextEvent event);
}
