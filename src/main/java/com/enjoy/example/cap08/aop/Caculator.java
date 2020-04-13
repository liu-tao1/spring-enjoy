package com.enjoy.example.cap08.aop;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/29
 */
public class Caculator /*implements ICaculator*/ {

    public int div(int i, int j) {
        System.out.println("div执行");
        return i/j;
    }

    public String sub(int i, int j) {
        System.out.println("sub执行");
        return i - j + "";
    }
}
