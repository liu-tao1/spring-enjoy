package com.example.cap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/27
 */
public class Cap02AnnoTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigMain.class);

        System.out.println(context.getBean("p"));
    }
}
