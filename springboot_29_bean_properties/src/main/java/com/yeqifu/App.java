package com.yeqifu;

import com.yeqifu.bean.CartoonCatAndMouse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author: yeqifu
 * @date: 2023/12/10 21:51
 */
@SpringBootApplication
@Import(CartoonCatAndMouse.class)
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class);
        CartoonCatAndMouse cartoonCatAndMouse = applicationContext.getBean(CartoonCatAndMouse.class);
        cartoonCatAndMouse.play();
    }
}
