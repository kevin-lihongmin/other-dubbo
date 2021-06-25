package com.tao.nacos;

import com.tao.microservice.service1.api.ConsumerService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application1Controller {

    @DubboReference(version = "1.0.0")
    private ConsumerService consumerService;
    @Autowired
    private CityClient cityClient;

    @GetMapping("/service")
    public String service(){
        return "test " + consumerService.service();
    }

    @GetMapping("/citys")
    public String citys(){
        return cityClient.list();
    }

}
