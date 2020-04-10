package com.example.cap10.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/10
 */
public class SpringEventTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MailConfig.class);
        MailSender sender = context.getBean(MailSender.class);
        sender.sendMail("北京");
    }
}
