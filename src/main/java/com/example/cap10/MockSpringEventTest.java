package com.example.cap10;

import com.example.cap10.event.ContextDestroyEvent;
import com.example.cap10.event.ContextRunningEvent;
import com.example.cap10.event.ContextStartEvent;
import com.example.cap10.listeners.ContextDestroyEventListener;
import com.example.cap10.listeners.ContextRunningEventListener;
import com.example.cap10.listeners.ContextStartEventListener;
import com.example.cap10.multicaster.ApplicationEventMulticaster;
import com.example.cap10.multicaster.SimpleApplicationEventMulticaster;

import java.util.concurrent.CountDownLatch;

/**
 * 模仿Spring事件机制实现自定义事件驱动编程
 *
 * @author liutao
 * @since 2020/4/10
 */
public class MockSpringEventTest {
    public static void main(String[] args) throws InterruptedException {
        testContextLifecycleEventInSync();
       // testContextLifecycleEventInAsync();
    }

    // 测试同步发布事件的方法
    public static void testContextLifecycleEventInSync() {
        // 新建SimpleApplicationEventMulticaster对象，并添加容器生命周期监听器
        ApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
        eventMulticaster.addContextListener(new ContextStartEventListener());
        eventMulticaster.addContextListener(new ContextRunningEventListener());
        eventMulticaster.addContextListener(new ContextDestroyEventListener());
        // 发射容器启动事件ContextStartEvent
        eventMulticaster.multicastEvent(new ContextStartEvent());
        // 发射容器正在运行事件ContextRunningEvent
        eventMulticaster.multicastEvent(new ContextRunningEvent());
        // 发射容器正在运行事件ContextDestroyEvent
        eventMulticaster.multicastEvent(new ContextDestroyEvent());
    }

    // 测试异步发布事件的方法
    public static void testContextLifecycleEventInAsync() throws InterruptedException {
        // 新建SimpleApplicationEventMulticaster对象，并添加容器生命周期监听器
        ApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
        eventMulticaster.addContextListener(new ContextStartEventListener());
        eventMulticaster.addContextListener(new ContextRunningEventListener());
        eventMulticaster.addContextListener(new ContextDestroyEventListener());

        ((SimpleApplicationEventMulticaster) eventMulticaster).setAsync(true);

        // 发射容器启动事件ContextStartEvent
        eventMulticaster.multicastEvent(new ContextStartEvent());
        // 发射容器正在运行事件ContextRunningEvent
        eventMulticaster.multicastEvent(new ContextRunningEvent());
        // 发射容器正在运行事件ContextDestroyEvent
        eventMulticaster.multicastEvent(new ContextDestroyEvent());
        // 这里没明白在没有用CountDownLatch的情况下为何主线程退出，非后台线程的子线程也会退出？？？为了测试，所有先用CountDownLatch锁住main线程先
        // 经过测试，原来是因为用了junit的方法，test方法线程退出后，test方法线程产生的非后台线程也随之退出，而下面的main方法启动的非后台线程则不会
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await();

    }
}
