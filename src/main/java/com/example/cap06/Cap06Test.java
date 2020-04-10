package com.example.cap06;

import com.example.cap06.bean.Bird;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class Cap06Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap06Config.class);
        System.out.println("-----bean容器创建完成");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            if (name.startsWith("org.springframework")) {
                continue;
            }
            System.out.println(name);
        }
        Bird bird = context.getBean(Bird.class);
        System.out.println(bird.toString());

        //配置文件可通过environment环境中取到
        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println(environment.getProperty("bird.color"));
    }
}
