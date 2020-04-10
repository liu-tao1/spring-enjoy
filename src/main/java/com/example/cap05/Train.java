package com.example.cap05;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class Train implements InitializingBean, DisposableBean {
    private String name;

    public Train(String name) {
        System.out.println("Train AllConstructor,name:" + name);
        this.name = name;
    }

    public Train() {
        System.out.println("Train NoConstructor,name:" + name);
    }

    public void destroy() throws Exception {
        System.out.println("Train destroy,name:" + name);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Train afterPropertiesSet,name:" + name);
    }
}
