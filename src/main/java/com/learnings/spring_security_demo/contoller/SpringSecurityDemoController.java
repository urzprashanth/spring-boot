package com.learnings.spring_security_demo.contoller;

import com.learnings.spring_security_demo.model.Student;
import com.learnings.spring_security_demo.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringSecurityDemoController {

    @Autowired
    private StudentService service;

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/home")
    public String greet(HttpServletRequest request){
        return "Welcome to Spring Security Demo Practice" + request.getSession().getId();
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @PostMapping("student")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }
}
