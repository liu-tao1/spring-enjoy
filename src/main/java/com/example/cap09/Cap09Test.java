package com.example.cap09;

import com.example.cap09.beans.OrderService;
import com.example.cap09.config.Cap09Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/1
 */
public class Cap09Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap09Config.class);
        System.out.println("-----bean容器创建完成");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            if (name.startsWith("org.springframework")) {
                continue;
            }
            System.out.println(name);
        }

        OrderService orderService = context.getBean(OrderService.class);
        orderService.add();
    }
}
