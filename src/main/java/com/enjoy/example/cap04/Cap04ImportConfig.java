package com.enjoy.example.cap04;

import com.enjoy.example.cap01.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
@Configuration
@Import(value = {TaoImportReg.class, Dog.class, TaoImportSelector.class}) // BeanDefinitionName:默认为全称类名com.example.cap04.Dog
public class Cap04ImportConfig {

    // BeanDefinitionName:默认为方法名.可指定name
    @Bean("per")
    public Person person() {
        System.out.println("添加per");
        return new Person("tao", 11);
    }

    @Bean
    public TaoFactoryBean taoFactoryBean() {
        return new TaoFactoryBean();
    }
}
