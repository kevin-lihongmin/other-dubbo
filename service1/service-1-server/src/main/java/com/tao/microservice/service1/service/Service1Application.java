package com.tao.microservice.service1.service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class Service1Application implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }

    @Resource
    private ConsumerServiceImpl service;

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("开始调用微服务！");

        Thread.sleep(3000);

        String service = this.service.service();
        System.out.println(service);


    }

}
