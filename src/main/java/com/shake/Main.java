package com.shake;/*
 * @author: ${NAME}
 * @Description
 * @Date ${DATE}
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args); //自動創建IOC容器, 啟動tomcat服務器
    }
}