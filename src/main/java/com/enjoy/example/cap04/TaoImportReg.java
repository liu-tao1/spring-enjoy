package com.enjoy.example.cap04;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class TaoImportReg implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean a = registry.containsBeanDefinition("com.example.cap04.Cat");
        boolean b = registry.containsBeanDefinition("com.example.cap04.Dog");
        if (a && b) {
            registry.registerBeanDefinition("peiqi", new RootBeanDefinition(Pig.class));
        }
    }
}
