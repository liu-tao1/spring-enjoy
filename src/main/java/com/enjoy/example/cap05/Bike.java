package com.enjoy.example.cap05;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class Bike {
    private String name;

    public Bike() {
        System.out.println("Nobike 构建,name:" + name);
    }

    public Bike(String name) {
        System.out.println("Allbike 构建,name:" + name);
        this.name = name;
    }

    public void initMethod() {
        System.out.println("bike initMethod,name:" + name);
    }

    public void destroyMethod() {
        System.out.println("bike destroyMethod,name:" + name);
    }
}
