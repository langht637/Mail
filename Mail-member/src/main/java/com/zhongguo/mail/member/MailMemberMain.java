package com.zhongguo.mail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.zhongguo.mail.member.feign")
@SpringBootApplication
public class MailMemberMain {
    public static void main(String[] args) {
        SpringApplication.run(MailMemberMain.class,args);
    }

}
