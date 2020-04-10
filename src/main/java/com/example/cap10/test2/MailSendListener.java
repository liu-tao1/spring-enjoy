package com.example.cap10.test2;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/10
 */
@Component
public class MailSendListener implements ApplicationListener<MailSendEvent> {
    @Override
    public void onApplicationEvent(MailSendEvent mailSendEvent) {
        MailSendEvent event = mailSendEvent;
        System.out.println("MailSendListener监听到MailSender向" + event.getTo() + "发送了邮件");
    }
}
