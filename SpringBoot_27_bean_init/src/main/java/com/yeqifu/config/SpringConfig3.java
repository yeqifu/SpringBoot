package com.yeqifu.config;

import com.yeqifu.bean.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: yeqifu
 * @date: 2023/12/3 17:05
 */
@ComponentScan(basePackages = {"com.yeqifu.bean", "com.yeqifu.config"})
public class SpringConfig3 {
    @Bean
    public DogFactoryBean dog11() {
        return new DogFactoryBean();
    }
}
