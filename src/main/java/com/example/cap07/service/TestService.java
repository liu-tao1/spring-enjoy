package com.example.cap07.service;

import com.example.cap07.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
@Service
public class TestService {

//    @Qualifier("testDao2")
    @Autowired
//    @Resource(name = "testDao2")
    private TestDao testDao2;

    public void print() {
        System.out.println(testDao2);
    }

}
