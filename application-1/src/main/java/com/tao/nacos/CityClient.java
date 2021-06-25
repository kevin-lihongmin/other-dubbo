package com.tao.nacos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("city-service")
public interface CityClient {

    @GetMapping("/city/cities/list")
    String list();
}
