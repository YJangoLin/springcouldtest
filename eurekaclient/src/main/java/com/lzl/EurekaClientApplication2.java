package com.lzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Zonglin Liang on 2021/2/21.
 * Describe:
 **/
@SpringBootApplication
public class EurekaClientApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication2.class,args);
    }
}