package com.hkt.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${app-name}")
    private String appName;
    @GetMapping("/healthcheck")
    public String healthcheck() {
        return appName + " is ok.";
    }
}
