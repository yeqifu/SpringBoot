package com.yeqifu.config;

import com.yeqifu.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yeqifu
 * @date: 2023/12/3 22:22
 */
@Configuration(proxyBeanMethods = false)
public class SpringConfig33 {
    @Bean
    public Cat getCat() {
        return new Cat();
    }
}
