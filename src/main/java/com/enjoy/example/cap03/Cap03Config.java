package com.enjoy.example.cap03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.enjoy.example.cap03",
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = TaoTypeFilter.class)},
        useDefaultFilters = false)
public class Cap03Config {
}
