package com.enjoy.example.cap02;

import com.enjoy.example.cap01.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/27
 */
//配置类===配置文件
@Configuration
@ComponentScan(value = {"com.enjoy.example.cap02.beans"})
public class ConfigMain {

    //给容器中注入一个bean，类型为返回值
    @Bean
    public Person p() {
        return new Person("tao", 22);
    }
}
