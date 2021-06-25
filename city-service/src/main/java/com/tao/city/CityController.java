package com.tao.city;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

    @GetMapping("/list")
    public String list() {
        return "成都|北京|上海";
    }
}
