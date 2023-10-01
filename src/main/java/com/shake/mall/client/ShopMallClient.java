package com.shake.mall.client;/*
 * @author: client
 * @Description
 * @Date 2023/10/1
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "shopmall" )

public interface ShopMallClient {
    @GetMapping("test")
    public String test();
}
