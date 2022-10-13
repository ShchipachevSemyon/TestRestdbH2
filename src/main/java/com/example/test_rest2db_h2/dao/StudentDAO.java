package com.example.test_rest2db_h2.dao;

import com.example.test_rest2db_h2.entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> getAllStudents();

    Student getStudents(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
