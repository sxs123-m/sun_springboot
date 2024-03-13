package com.sun.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙显圣
 * @version 1.0
 */
@RestController //将所有方法的返回结果转换成json字符串并返回
public class HiController {
    @RequestMapping("/hi")
    public String hi() {
        return "hi sun HiController";
    }
}
