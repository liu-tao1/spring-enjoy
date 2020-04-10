package com.example.cap05;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class Elephant {
    private String name;

    public Elephant() {
    }

    public Elephant(String name) {
        System.out.println("Elephant Contructor,name:" + name);
        this.name = name;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Elephant initMethod,name:" + name);
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Elephant destroyMethod,name:" + name);
    }
}
