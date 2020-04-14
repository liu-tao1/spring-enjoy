package com.enjoy.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/13
 */
@Controller
public class OrderController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "ok";
    }

    @RequestMapping("/index")
    public String index() {
        return "index"; //到我们的子容器ServeltConfig找到/WEB-INF/pages/index.jsp
    }
}
