package com.khadri.spring.core.di.exclude.zero.arg.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exclude_zero_arg_constructor.xml");
        Employee bean = context.getBean(Employee.class);

        System.out.println(bean);
    }
}
