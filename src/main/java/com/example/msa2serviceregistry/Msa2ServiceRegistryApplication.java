package com.example.msa2serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/*
* 다른 서비스가 등록될 서버로 작동한다.
*
* */

@SpringBootApplication
@EnableEurekaServer
public class Msa2ServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Msa2ServiceRegistryApplication.class, args);
    }

}
