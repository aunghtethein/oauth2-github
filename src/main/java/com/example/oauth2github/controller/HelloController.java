package com.example.oauth2github.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class.getName());

    @GetMapping("/")
    public String main(OAuth2AuthenticationToken token){
        logger.info(String.valueOf(token));
        return "main.html";
    }
}
