package com.enjoy.example.cap07.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/29
 */
@Component
public class Sun {

    //方式1：直接在属性中注入@Autowired
    @Autowired
    private Moon moon;

    public Sun() {
        System.out.println("Nosun constructor");
    }

    //方式2：构造器注入@Autowired
    //（若没有无参构造方法，可以不加Autowired，spring会自动按构造注入moon）
    public Sun(Moon moon) {
        this.moon = moon;
        System.out.println("Allsun constructor");
    }

    //方式3：set注入@Autowired
    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    public Moon getMoon() {
        return moon;
    }

    @Override
    public String toString() {
        return "Sun{" + "moon=" + moon + '}';
    }
}
