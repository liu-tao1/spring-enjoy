package com.example.cap08.dynamic;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/3
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        int n1 = 100, n2 = 5;
        //静态代理测试
        //IMath math = new MathProxy();

        //JDK动态代理实现了接口的类
        //IMath math = (IMath)new DynamicProxy().getProxyObject(new Math());
        //JDK动态代理未实现了接口的类ClassCastException: com.sun.proxy.$Proxy0 cannot be cast to com.example.cap09.dynamic.jdk.Order
        Order order2 = (Order)new DynamicProxy().getProxyObject(new Order());
        order2.add();

        //CGLIB代理实现了接口的类
        IMath math = (IMath)new DynamicCGLIBProxy().getProxyObject(new Math());
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
        //CGLIB代理未实现了接口的类
        Order order = (Order) new DynamicCGLIBProxy().getProxyObject(new Order());
        order.add();
    }
}
