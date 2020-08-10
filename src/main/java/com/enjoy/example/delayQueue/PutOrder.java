package com.enjoy.example.delayQueue;

import java.util.Date;
import java.util.concurrent.DelayQueue;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/8/10
 */
public class PutOrder implements Runnable {

    private DelayQueue<ItemVo<Order>> queue;

    public PutOrder(DelayQueue<ItemVo<Order>> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {

        // 5s到期
        Order orderTb = new Order("Tb123");
        ItemVo<Order> itemTb = new ItemVo<>(5000, orderTb);
        queue.offer(itemTb);

        System.out.println(new Date() + "提交延时5s：" + orderTb);
        // 8s
        Order orderJd = new Order("Jd123");
        ItemVo<Order> itemJd = new ItemVo<>(8000, orderJd);
        queue.offer(itemJd);

        System.out.println(new Date() + "提交延时8s：" + orderTb);
    }
}
