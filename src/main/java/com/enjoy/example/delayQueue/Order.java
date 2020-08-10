package com.enjoy.example.delayQueue;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/8/10
 */
public class Order {

    private String orderNo;

    public Order(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNo='" + orderNo + '\'' + '}';
    }
}
