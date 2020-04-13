package com.enjoy.example.cap10.listeners;

import com.enjoy.example.cap10.event.AbstractContextEvent;
import com.enjoy.example.cap10.event.ContextRunningEvent;

/**
 * 容器运行事件监听器
 *
 * @author liutao
 * @since 2020/4/10
 */
public class ContextRunningEventListener implements ContextListener<AbstractContextEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    public void onApplicationEvent(AbstractContextEvent event) {
        if (event instanceof ContextRunningEvent) {
            System.out.println("容器开始运行。。。");
            try {
                Thread.sleep(3000);
                System.out.println("容器运行结束。。。");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
