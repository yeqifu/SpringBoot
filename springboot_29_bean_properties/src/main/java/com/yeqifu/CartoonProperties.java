package com.yeqifu;

import com.yeqifu.bean.Cat;
import com.yeqifu.bean.Mouse;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: yeqifu
 * @date: 2023/12/10 21:53
 */
@Data
@ConfigurationProperties(prefix = "cartoon")
public class CartoonProperties {
    private Cat cat;

    private Mouse mouse;
}
