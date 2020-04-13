package com.enjoy.example.cap11.processor;

import com.enjoy.example.cap11.beans.Desk;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/11
 */
@Component
public class DefinitionProcessor implements BeanDefinitionRegistryPostProcessor {

    //执行时机在postProcessBeanFactory之前
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("DefinitionProcessor.postProcessBeanDefinitionRegistry count:" + registry.getBeanDefinitionCount());
        registry.registerBeanDefinition("dsk", BeanDefinitionBuilder.rootBeanDefinition(Desk.class).getBeanDefinition());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("DefinitionProcessor.postProcessBeanFactory count:" + beanFactory.getBeanDefinitionCount());
    }
}
