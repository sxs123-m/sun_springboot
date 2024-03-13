package com.sun.springboot.config;

import com.sun.springboot.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孙显圣
 * @version 1.0
 */
@Configuration //作为一个配置类
public class Config {

    @Bean //将单例bean：Dog注入容器
    public Dog dog() {
        return new Dog();
    }
}
