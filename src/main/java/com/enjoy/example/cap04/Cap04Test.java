package com.enjoy.example.cap04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class Cap04Test {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap04ImportConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();

        Monkey bean = (Monkey) context.getBean("taoFactoryBean");
        System.out.println(bean);

        TaoFactoryBean bean2 = (TaoFactoryBean) context.getBean("&taoFactoryBean");
        System.out.println(bean2);

        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
