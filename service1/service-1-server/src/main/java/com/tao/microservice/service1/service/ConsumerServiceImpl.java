package com.tao.microservice.service1.service;

import com.tao.microservice.service1.api.ConsumerService;
import com.tao.microservice.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class ConsumerServiceImpl implements ConsumerService {

    @DubboReference(version = "1.0.0")
    ProviderService providerService;

    public String service() {
        return "Consumer invoke | " + providerService.service();
    }
}
