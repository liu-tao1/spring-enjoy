package com.enjoy.example.cap10.event;

/**
 * AbstractContextEvent是容器事件的基本抽象类， 因为事件也可以携带数据，因此这里定义了一个timestamp属性，用来记录事件的发生时间。
 *
 * @author liutao
 * @since 2020/4/10
 */
public class AbstractContextEvent implements Event {
    private static final long serialVersionUID = -6159391039546783871L;

    private final long timestamp = System.currentTimeMillis();

    public final long getTimestamp() {
        return this.timestamp;
    }
}
