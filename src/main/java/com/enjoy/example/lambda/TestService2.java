package com.enjoy.example.lambda;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/15
 */
@FunctionalInterface
public interface TestService2 {

    String getTest(String a, int b);

    default void deal() {
        System.out.println("haha");
    }
}
