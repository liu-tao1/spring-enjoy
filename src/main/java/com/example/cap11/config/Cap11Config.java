package com.example.cap11.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/11
 */
@Configuration
@ComponentScan(value = {"com.example.cap11.beans","com.example.cap11.processor"})
public class Cap11Config {
}
