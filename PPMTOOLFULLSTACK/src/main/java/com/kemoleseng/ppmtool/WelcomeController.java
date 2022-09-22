package com.kemoleseng.ppmtool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping ("/welcome")
    public String welcomeMsg() {
        String welcomeMsg = "Welcome to SPRINGBOOT WORLD!";
        return welcomeMsg;
    }

}
