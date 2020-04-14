package com.enjoy.example.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/13
 */
@ComponentScan(value = "com.enjoy.example.mvc",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
public class RootConfig {
}
