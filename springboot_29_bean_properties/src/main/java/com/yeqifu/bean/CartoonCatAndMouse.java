package com.yeqifu.bean;

import com.yeqifu.CartoonProperties;
import lombok.Data;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.util.StringUtils;

/**
 * @author: yeqifu
 * @date: 2023/12/10 21:53
 */
@Data
@EnableConfigurationProperties({CartoonProperties.class})
public class CartoonCatAndMouse {
    private Mouse mouse;
    private Cat cat;

    private CartoonProperties cartoonProperties;

    public CartoonCatAndMouse(CartoonProperties cartoonProperties) {
        this.cartoonProperties = cartoonProperties;
        mouse = new Mouse();
        mouse.setName(cartoonProperties.getMouse() != null && StringUtils.hasText(cartoonProperties.getMouse().getName()) ? cartoonProperties.getMouse().getName() : "jerry");
        mouse.setAge(cartoonProperties.getMouse() != null && null != cartoonProperties.getMouse().getAge() ? cartoonProperties.getMouse().getAge() : 1);
        cat = new Cat();
        cat.setName(cartoonProperties.getCat() != null && StringUtils.hasText(cartoonProperties.getCat().getName()) ? cartoonProperties.getCat().getName() : "tom");
        cat.setAge(cartoonProperties.getCat() != null && null != cartoonProperties.getCat().getAge() ? cartoonProperties.getCat().getAge() : 2);
    }

    public void play() {
        System.out.println(cat.getAge() + "岁的" + cat.getName() + "和" + mouse.getAge() + "岁的" + mouse.getName() + "打起来了");
    }
}
