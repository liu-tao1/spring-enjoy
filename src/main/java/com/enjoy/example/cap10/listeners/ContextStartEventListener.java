package com.enjoy.example.cap10.listeners;

import com.enjoy.example.cap10.event.AbstractContextEvent;
import com.enjoy.example.cap10.event.ContextStartEvent;

/**
 * 容器开始事件监听器
 *
 * @author liutao
 * @since 2020/4/10
 */
public class ContextStartEventListener implements ContextListener<AbstractContextEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    public void onApplicationEvent(AbstractContextEvent event) {
        if (event instanceof ContextStartEvent) {
            System.out.println("容器启动。。。，启动时间为：" + event.getTimestamp());
        }
    }
}
