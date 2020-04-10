package com.example.cap10.test2;

import org.springframework.context.ApplicationEvent;

/**
 * 继承了ApplicationContextEvent，就是个容器事件
 *
 * @author liutao
 * @since 2020/4/10
 */
public class MailSendEvent extends ApplicationEvent {

    private String to;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MailSendEvent(Object source, String to) {
        super(source);
        this.to = to;
    }

    public String getTo() {
        return to;
    }
}
