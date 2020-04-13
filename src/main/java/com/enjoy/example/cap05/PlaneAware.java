package com.enjoy.example.cap05;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//实现了ApplicationContextAware的bean会被ApplicationContextAwareProcessor处理
//invokeAwareInterfaces时调用自定义类PlanAware的setApplicationContext方法给applicationContext赋值
public class PlaneAware implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public static ApplicationContext getApp() {
        return applicationContext;
    }

    public PlaneAware() {
        System.out.println("NoPlaneAware 构建");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
