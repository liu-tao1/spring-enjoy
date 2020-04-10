package com.example.cap07.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/29
 */
public class Light implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的application:" + applicationContext);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("传入的对象beanName:" + name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String result = resolver.resolveStringValue("你好${os.name}, ${bird.color}，计算：#{3*8}");
        System.out.println(result);
    }
}
