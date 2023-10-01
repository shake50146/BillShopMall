package com.shake.mall.controller;/*
 * @author: AccountController
 * @Description
 * @Date 2023/9/27
 */

import com.shake.mall.client.ShopMallClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class AccountController {

    @Autowired
    private ShopMallClient client;
    @GetMapping("boot")
    public String Hello(){
        String test = client.test();
        return test;
    }
}
