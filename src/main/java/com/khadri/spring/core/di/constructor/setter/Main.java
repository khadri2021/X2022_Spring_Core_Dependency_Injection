package com.khadri.spring.core.di.constructor.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_in_setter.xml");
        Bottle bean = context.getBean(Bottle.class);
        System.out.println(bean);
    }
}
