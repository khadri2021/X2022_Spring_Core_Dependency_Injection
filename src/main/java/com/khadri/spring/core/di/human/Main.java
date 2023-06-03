package com.khadri.spring.core.di.human;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HumanRobot humanRobot = (HumanRobot) context.getBean("robot");
        System.out.println(humanRobot);
    }
}