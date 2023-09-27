package com.shake.mall.controller;/*
 * @author: AccountController
 * @Description
 * @Date 2023/9/27
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class AccountController {

    @GetMapping("boot")
    public String Hello(){
        return "Hello Spring Boot";
    }
}
