package com.sun.sunspringboot.config;

import com.sun.sunspringboot.bean.Monster;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孙显圣
 * @version 1.0
 */
@Configuration //配置类
@ComponentScan("com.sun.sunspringboot") //指定要扫描的包
public class SunConfig {
    @Bean
    public Monster monster() {
        return new Monster(); //单例bean注入容器
    }
}
