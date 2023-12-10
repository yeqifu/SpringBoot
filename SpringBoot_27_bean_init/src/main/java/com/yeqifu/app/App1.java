package com.yeqifu.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yeqifu
 * @date: 2023/12/3 16:25
 */
public class App1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Object cat = classPathXmlApplicationContext.getBean("cat");
        System.out.println(cat);
        Object druidDataSource = classPathXmlApplicationContext.getBean("druidDataSource");
        System.out.println(druidDataSource);

        System.out.println("--------------------------------------------------------------");

        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
