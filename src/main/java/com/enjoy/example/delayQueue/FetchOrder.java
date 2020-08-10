package com.enjoy.example.delayQueue;

import java.util.Date;
import java.util.concurrent.DelayQueue;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/8/10
 */
public class FetchOrder implements Runnable {
    private DelayQueue<ItemVo<Order>> queue;

    public FetchOrder(DelayQueue<ItemVo<Order>> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ItemVo<Order> itemVo = queue.take();
                Order order = itemVo.getData();

                System.out.println(new Date() + "get from queue:" + order);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
