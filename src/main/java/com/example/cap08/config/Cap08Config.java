package com.example.cap08.config;

import com.example.cap08.aop.Caculator;
import com.example.cap08.aop.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/29
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap08Config {
    /*@Bean
    public ICaculator caculator() {
        return new Caculator();
    }*/
    @Bean
    public Caculator caculator() {
        return new Caculator();
    }

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
