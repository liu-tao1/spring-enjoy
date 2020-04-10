package com.example.cap05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class Cap05Test {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("BikeBeans.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap05Config.class);
        System.out.println("-----bean容器创建完成");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            if (name.startsWith("org.springframework")) {
                continue;
            }
            System.out.println(name);
        }
        System.out.println("-----------------");
        PlaneAware plane = (PlaneAware)context.getBean("planeAware");
        System.out.println(plane.getClass()+"paln");
        System.out.println(PlaneAware.getApp().getBean("elephant"));

        System.out.println("-----bean容器准备销毁");
        context.close();
    }
}
