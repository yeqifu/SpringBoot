package com.yeqifu.app;

import com.yeqifu.config.SpringConfig33;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yeqifu
 * @date: 2023/12/3 16:25
 */
public class App33 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig33.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        System.out.println("-------------------------------------------------");
        SpringConfig33 springConfig33 = annotationConfigApplicationContext.getBean("springConfig33", SpringConfig33.class);
        System.out.println(springConfig33);
        System.out.println(springConfig33.getCat());
        System.out.println(springConfig33.getCat());
        System.out.println(springConfig33.getCat());
    }
}
