package com.enjoy.example.cap07.service;

import org.springframework.stereotype.Service;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/13
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String hello() {
        return "hello";
    }
}
