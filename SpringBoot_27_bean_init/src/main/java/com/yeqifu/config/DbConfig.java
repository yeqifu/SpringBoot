package com.yeqifu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

/**
 * @author: yeqifu
 * @date: 2023/12/3 16:55
 */
//@Configuration
public class DbConfig {
    @Bean
    public DruidDataSource druidDataSource() {
        return new DruidDataSource();
    }
}
