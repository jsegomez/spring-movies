package com.jsegomez.movies.web.controllers;

import com.jsegomez.movies.domain.services.JseGomezAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final JseGomezAiService iaService;
    private final String platform;

    public HelloController(
            @Value("${app.environment}") String platform,
            JseGomezAiService iaService
    ) {
        this.platform = platform;
        this.iaService = iaService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        String message = this.iaService.generateGreeting();
        return message + " Plataforma: " + platform;
    }
}

