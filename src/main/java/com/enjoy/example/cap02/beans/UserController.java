package com.enjoy.example.cap02.beans;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/18
 */
@Controller
public class UserController {

    /**
     * 当接口存在多个实现类时，需要制定具体的实现类
     * 如@Autowired+@Qualifier("custServiceImpl")
     * 或@Resource(name="custServiceImpl")
     *
     */
    @Resource(name="custServiceImpl")
    private UserService userService;
}
