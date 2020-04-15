package com.enjoy.example.lambda;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/15
 */
public class TestSer {
    public static void main(String[] args) {

        MallService service = new MallService(new TestService() {
            @Override
            public String getTest() {
                return "getTest value";
            }
        });

        // Lambda表达式的形式如下
        // （param1, param2, param3, param4…）->{ doing……}；
        MallService service2 = new MallService(() -> "my test2");


        System.out.println(service2.getTestService().getTest());
        System.out.println(service.getTestService().getTest());
        service.getTestService().deal();

        //标准写法
        MallService service3 = new MallService((a, b) -> {
            System.out.println("实现我的");
            return a + b;
        });
        //简写
       // MallService service3 = new MallService((a, b) -> a + b);
        System.out.println(service3.getTestService2().getTest("22", 3));
    }
}
