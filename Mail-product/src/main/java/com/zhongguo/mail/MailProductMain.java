package com.zhongguo.mail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.zhongguo.mail.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class MailProductMain {
    public static void main(String[] args) {
        SpringApplication.run(MailProductMain.class,args);
    }
}
