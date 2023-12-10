package com.yeqifu.app;

import com.yeqifu.bean.Cat;
import com.yeqifu.bean.Mouse;
import com.yeqifu.config.SpringConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yeqifu
 * @date: 2023/12/3 16:25
 */
public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig4.class);
        // 使用上下文对象在容器初始化完毕后注入 bean
        annotationConfigApplicationContext.registerBean("tom", Cat.class, 0);
        annotationConfigApplicationContext.registerBean("tom", Cat.class, 1);
        annotationConfigApplicationContext.registerBean("tom", Cat.class, 2);
        annotationConfigApplicationContext.register(Mouse.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("----------------------------------------");
        System.out.println(annotationConfigApplicationContext.getBean(Cat.class));
    }
}
