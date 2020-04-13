package com.enjoy.example.cap10.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/10
 */
@Component("mailSender")
public class MailSender implements ApplicationEventPublisherAware {
    //容器事件由容器触发,继承了ApplicationEventPublisher具有发布时间的功能
    @Autowired
    private ApplicationContext applicationContext;

    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMail(String to) {
        System.out.println("MailSender开始发送邮件");
        MailSendEvent event = new MailSendEvent(applicationContext, to);
        applicationContext.publishEvent(event);

        //实现了ApplicationEventPublisherAware也具有发布事件的功能
        applicationEventPublisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
