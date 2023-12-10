package com.yeqifu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: yeqifu
 * @date: 2023/12/3 17:31
 */
public class DogFactoryBean implements FactoryBean<Dog> {
    @Override
    public Dog getObject() throws Exception {
        Dog dog = new Dog();
        // 进行其它操作...
        // 赋值啥的
        return dog;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
