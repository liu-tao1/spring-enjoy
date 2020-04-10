package com.example.cap07.controller;

import com.example.cap07.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;
}
