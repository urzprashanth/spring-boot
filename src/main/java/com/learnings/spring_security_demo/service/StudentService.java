package com.learnings.spring_security_demo.service;

import com.learnings.spring_security_demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Prashanth", "Java"),
            new Student(2,"Jobish", "webMethods")
    ));

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
