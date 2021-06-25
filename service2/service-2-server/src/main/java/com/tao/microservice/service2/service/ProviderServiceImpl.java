package com.tao.microservice.service2.service;

import com.tao.microservice.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {

    public String service() {
        return "Provider invoke";
    }
}
