package com.yeqifu.config;

import com.yeqifu.bean.Dog;
import org.springframework.context.annotation.Import;

/**
 * @author: yeqifu
 * @date: 2023/12/3 17:05
 */
@Import({Dog.class, DbConfig.class})
public class SpringConfig4 {

}
