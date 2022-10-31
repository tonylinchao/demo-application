package com.hkt.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/healthcheck")
    public String healthcheck() {
        return "Application B is ok.";
    }
}
