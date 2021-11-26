package com.entomo.test;

import com.entomo.beans.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception{

        ApplicationContext context = new ClassPathXmlApplicationContext("/com/entomo/resources/applicationContext.xml");
        HelloSpring hs =(HelloSpring) context.getBean("helloBean");
        System.out.println(hs.greet());
    }
}
