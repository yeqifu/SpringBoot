package com.yeqifu.bean;

import org.springframework.stereotype.Component;

/**
 * @author: yeqifu
 * @date: 2023/12/3 16:25
 */
@Component("tom")
public class Cat {

    private Integer age;

    public Cat() {
    }

    public Cat(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
