package com.sahana.studentapi.service;

import com.sahana.studentapi.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public String deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        return "Student deleted";
    }
}