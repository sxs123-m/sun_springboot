package com.sun.springboot;

import com.sun.media.sound.SoftTuning;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 孙显圣
 * @version 1.0
 */
@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class, args);

        Object bean = ioc.getBean("dog");
        System.out.println(bean);
    }
}
