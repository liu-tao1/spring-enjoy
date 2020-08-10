package com.enjoy.example.delayQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/8/10
 */
public class ItemVo<T> implements Delayed {

    /** 过期时长：单位毫秒 */
    private long acticeTime;
    private T data;

    public ItemVo(long acticeTime, T data) {
        super();
        this.acticeTime = TimeUnit.NANOSECONDS.convert(acticeTime, TimeUnit.MILLISECONDS) + System.nanoTime();
        this.data = data;
    }

    public long getActiceTime() {
        return acticeTime;
    }

    public T getData() {
        return data;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(acticeTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long d = getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS);
        return (d == 0) ? 0 : ((d > 0) ? 1 : -1);
    }
}
