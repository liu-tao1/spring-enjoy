package com.example.cap07;

import com.example.cap07.bean.Moon;
import com.example.cap07.bean.Sun;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/3/28
 */
public class Cap07Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap07Config.class);
        System.out.println("-----bean容器创建完成");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            if (name.startsWith("org.springframework")) {
                continue;
            }
            System.out.println(name);
        }
        //TestService testService = context.getBean(TestService.class);
        //当使用@Qualifier("testDao2")时，打印自定义的flag2
        //不使用默认testDao，打印flag1
        //testService.print();
        //当容器中存在2个bean时不能通过class去getBean会报错NoUniqueBeanDefinitionException
        //TestDao testDao = context.getBean(TestDao.class);
        //这里根据实际的beanName获取对于的bean
//        TestDao testDao = (TestDao) context.getBean("testDao2");
//        System.out.println(testDao);

        System.out.println("--------------------");
        Moon moon = context.getBean(Moon.class);
        System.out.println(moon);
        Sun sun = context.getBean(Sun.class);
        System.out.println(sun.getMoon());
        //直接从容器中获取的moon和Sun对象注入的moon是同一个实例
    }
}
