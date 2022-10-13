package com.example.test_rest2db_h2.service;

import com.example.test_rest2db_h2.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student getStudents(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
