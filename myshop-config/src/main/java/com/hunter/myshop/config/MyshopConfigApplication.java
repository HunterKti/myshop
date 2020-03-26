package com.hunter.myshop.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Hunter
 * @date 2020/3/24
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class MyshopConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyshopConfigApplication.class,args);
    }

}
