package com.enjoy.example.mvc.async;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;

/**
 * MVC异步线程
 *
 * @author liutao
 * @since 2020/4/13
 */
@Controller
public class AsyncOrderController {

    @ResponseBody
    @RequestMapping("/orderAsync")
    public Callable<String> order01() {

        System.out.println("主线程start" + Thread.currentThread() + "," +System.currentTimeMillis());
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("子线程start" + Thread.currentThread() + "," +System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("子线程end" + Thread.currentThread() + "," +System.currentTimeMillis());
                return "haha";
            }
        };

        System.out.println("主线程end" + Thread.currentThread() + "," +System.currentTimeMillis());
        return callable;
    }
}
