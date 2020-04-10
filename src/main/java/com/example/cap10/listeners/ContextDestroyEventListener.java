package com.example.cap10.listeners;

import com.example.cap10.event.AbstractContextEvent;
import com.example.cap10.event.ContextDestroyEvent;

/**
 * 容器销毁事件监听器
 *
 * @author liutao
 * @since 2020/4/10
 */
public class ContextDestroyEventListener implements ContextListener<AbstractContextEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    public void onApplicationEvent(AbstractContextEvent event) {
        if (event instanceof ContextDestroyEvent) {
            System.out.println("容器销毁。。。，销毁时间为：" + event.getTimestamp());
        }
    }
}
