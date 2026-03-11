package com.example.awsdemoapp;

import com.example.awsdemoapp.config.ConfigReader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String demo() {
        ConfigReader.load();
        return "<h1>Welcome to AWS Rajesh Bhardwaj!!</h1>";
    }


}
