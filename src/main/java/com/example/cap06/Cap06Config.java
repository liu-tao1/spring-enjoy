package com.example.cap06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
@Configuration
@ComponentScan(value = {"com.example.cap06.bean"})
//配置中加载这个自定义的配置文件
@PropertySource(value = "classpath:pro/test.properties")
public class Cap06Config {
}
