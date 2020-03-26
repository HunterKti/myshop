package com.hunter.myshop.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyshopServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyshopServiceAdminApplication.class, args);
    }

}
