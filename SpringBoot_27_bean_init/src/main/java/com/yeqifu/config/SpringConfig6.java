package com.yeqifu.config;

import com.yeqifu.bean.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: yeqifu
 * @date: 2023/12/9 21:36
 */
@Configuration
@Import(MyImportSelector.class)
public class SpringConfig6 {
}
