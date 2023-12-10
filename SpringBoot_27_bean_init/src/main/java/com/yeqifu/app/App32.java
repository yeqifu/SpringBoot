package com.yeqifu.app;

import com.yeqifu.config.SpringConfig3;
import com.yeqifu.config.SpringConfig32;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yeqifu
 * @date: 2023/12/3 16:25
 */
public class App32 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig32.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
