package com.khadri.spring.core.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
        Customer customer = (Customer) context.getBean("cust");
        System.out.println(customer);
    }
}
