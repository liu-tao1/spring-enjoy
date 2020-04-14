package com.enjoy.example.cap07.controller;

import com.enjoy.example.cap07.service.IUserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
@Controller
public class TestController {

    @Resource
    private IUserService userService;

    public String helloTest() {
        return userService.hello();
    }
}
