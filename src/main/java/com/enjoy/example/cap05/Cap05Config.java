package com.enjoy.example.cap05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 注解方式
 *
 * @author liutao
 * @since 2020/3/28
 */
@Configuration
@Import({JeepPostProcess.class, CarPostProcess.class})
public class Cap05Config {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Bike bike() {
        return new Bike("beybey");
    }

    @Bean
    public Train train() {
        return new Train("tao");
    }

    @Bean
    public Elephant elephant() {
        return new Elephant("eleName");
    }

    @Bean
    public PlaneAware planeAware() {
        return new PlaneAware();
    }
}
