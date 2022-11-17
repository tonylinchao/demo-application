package com.hkt.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${envVar}")
    private String envVar;

    @Value("${configMapVar}")
    private String configMapVar;

    @Value("${secretVar}")
    private String secretVar;
    @GetMapping("/healthcheck")
    public String healthcheck() {

        String message = "Get Value from secret or configMap.<br/><br/>" +
                "Environment Variable:" + envVar + "<br/>" +
                "ConfigMap Variable:" + configMapVar + "<br/>" +
                "Secret Variable:" + secretVar;

        return message;
    }
}
