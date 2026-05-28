package com.learnings.spring_security_demo.contoller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityDemoController {

    @GetMapping("/home")
    public String greet(HttpServletRequest request){
        return "Welcome to Spring Security Demo Practice" + request.getSession().getId();
    }
}
