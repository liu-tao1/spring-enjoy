package com.example.cap11.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/11
 */
@Component
public class GenericBFProssor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //所有bean的定义已经加载到beanFactory，但是还没有创建bean的实例
        System.out.println("postProcessBeanFactory invoke ...");

        String[] definitionNames = beanFactory.getBeanDefinitionNames();

        System.out.println(
                "当前有" + beanFactory.getBeanDefinitionCount() + "个bean定义，分别为:" + Arrays.asList(definitionNames));
        //postProcessBeanFactory invoke ...
        //当前有10个bean定义，分别为:[org.springframework.context.annotation.internalConfigurationAnnotationProcessor, org.springframework.context.annotation.internalAutowiredAnnotationProcessor, org.springframework.context.annotation.internalRequiredAnnotationProcessor, org.springframework.context.annotation.internalCommonAnnotationProcessor, org.springframework.context.event.internalEventListenerProcessor, org.springframework.context.event.internalEventListenerFactory, cap11Config, desk, shirt, genericBFProssor]
    }
}
