package com.enjoy.example.lambda;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/15
 */
@FunctionalInterface
public interface TestService {

    String getTest();

    default void deal() {
        System.out.println("haha");
    }
}
