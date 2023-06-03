package com.khadri.spring.core.di.constructor.different.args;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_differ_args.xml");
        Phone phone = context.getBean("phone", Phone.class);
        System.out.println(phone);
    }
}
