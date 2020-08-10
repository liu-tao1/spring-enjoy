package com.enjoy.example.cap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 传统方式创建beans
 *
 * @author liutao
 * @since 2020/3/27
 */
public class Cap01XMLTest {
    public static void main(String[] args) {
        //把beans.xml的类加载到容器
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中取bean
        Person per = (Person) app.getBean("per");
        System.out.println(per);

        //传统XmlBeanFactory加载
        /*BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        //从容器中取bean
        Person person = (Person) bf.getBean("per");
        System.out.println(person);*/
    }
}
