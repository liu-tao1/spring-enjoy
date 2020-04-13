package com.enjoy.example.cap11;

import com.enjoy.example.cap11.config.Cap11Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/1
 */
public class Cap11Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Cap11Config.class);
        System.out.println("-----bean容器创建完成");
    }
}
