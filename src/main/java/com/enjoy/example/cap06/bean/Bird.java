package com.enjoy.example.cap06.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Bird {
    //支持name字符
    @Value("tao")
    private String name;
    //SpringEL表达式
    @Value("#{20-3}")
    private Integer age;
    //可以读取自定义properties配置
    @Value("${bird.color}")
    private String color;

}
