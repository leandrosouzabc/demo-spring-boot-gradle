package com.example.demospringbootgradle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    
    @Value("${test.secret.value}")
    private String secretFromEnv;

    @Value("${test.configmap.value}")
    private String configMapFromEnv;

    @RequestMapping("/")
    public @ResponseBody String greeting(){
        return "Hello, World Again!!!!!";
    }

    @RequestMapping("/secret")
    public @ResponseBody String getSecret(){
        return "The secret value is: " + secretFromEnv;
    }

    @RequestMapping("/configmap")
    public @ResponseBody String getConfigMap(){
        return "The configmap value is: " + configMapFromEnv;
    }
}
