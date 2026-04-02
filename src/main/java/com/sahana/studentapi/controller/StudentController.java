package com.sahana.studentapi.controller;

import com.sahana.studentapi.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(1, "Sahi", "CSE"),
                new Student(2, "Ravi", "ECE"),
                new Student(3, "Anu", "IT")
        );
    }
}