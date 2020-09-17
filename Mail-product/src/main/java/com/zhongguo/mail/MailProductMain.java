package com.zhongguo.mail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhongguo.mail.product.dao")
@SpringBootApplication
public class MailProductMain {
    public static void main(String[] args) {
        SpringApplication.run(MailProductMain.class,args);
    }
}
