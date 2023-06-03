package com.khadri.spring.core.di.setter.different.args;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Main {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("setter_different_args.xml");

       Laptop laptop
        =(Laptop) beanFactory.getBean("laptop");

        System.out.println(laptop);

    }
}
