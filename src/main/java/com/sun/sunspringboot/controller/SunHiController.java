package com.sun.sunspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙显圣
 * @version 1.0
 */
@RestController
public class SunHiController {
    @RequestMapping("/sunhi")
    public String hi() {
        return "hi, SunHiController";
    }
}
