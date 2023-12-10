package com.yeqifu.app;

import com.yeqifu.config.SpringConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yeqifu
 * @date: 2023/12/3 16:25
 */
public class App3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig3.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
