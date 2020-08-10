package com.enjoy.example.delayQueue;

import java.util.concurrent.DelayQueue;

/**
 * 从系统可用性角度考虑：应用重启了怎么办？
 * 应用重启带来的问题：
 * 1、保存在queue中的数据会丢失
 * 2、已过期的数据不会被重复处理
 *
 * 解决之道：系统启动-检索数据库-扫描过期未支付的订单
 *
 * 集群化了怎么处理：应用直接会相互抢夺订单
 * 解决：应用分区处理（hash），引入消息队列MQ等
 *
 * @author liutao
 * @since 2020/8/10
 */
public class TestOrder {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<ItemVo<Order>> queue = new DelayQueue<>();

        new Thread(new PutOrder(queue)).start();

        new Thread(new FetchOrder(queue)).start();
    }

}
