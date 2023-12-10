package com.yeqifu.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yeqifu
 * @date: 2023/12/3 16:25
 */
public class App2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
