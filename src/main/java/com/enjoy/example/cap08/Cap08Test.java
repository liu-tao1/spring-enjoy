package com.enjoy.example.cap08;

import com.enjoy.example.cap08.aop.Caculator;
import com.enjoy.example.cap08.config.Cap08Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class Cap08Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap08Config.class);
        System.out.println("-----bean容器创建完成");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            if (name.startsWith("org.springframework")) {
                continue;
            }
            System.out.println(name);
        }
        System.out.println("------------------");

        //ICaculator caculator = context.getBean(ICaculator.class);
        Caculator caculator = context.getBean(Caculator.class);
        caculator.div(4, 1);
        //System.out.println(caculator.div(4, 0));
    }
}
