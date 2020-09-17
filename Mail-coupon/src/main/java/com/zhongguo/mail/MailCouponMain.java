package com.zhongguo.mail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.zhongguo.mail.coupon.dao")
@SpringBootApplication
public class MailCouponMain {
    public static void main(String[] args) {
        SpringApplication.run(MailCouponMain.class,args);
    }
}
