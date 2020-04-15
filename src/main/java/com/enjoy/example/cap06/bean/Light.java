package com.enjoy.example.cap06.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/14
 */
@Component
public class Light implements EmbeddedValueResolverAware, BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("name：" + name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        //${}占位符转换
        String s1 = resolver.resolveStringValue("${bird.test.newValue}");
        String s2 = resolver.resolveStringValue("${bird.test.name}");

        System.out.println("setEmbeddedValueResolver:" + s1);
        System.out.println("setEmbeddedValueResolver:" + s2);
    }
}
