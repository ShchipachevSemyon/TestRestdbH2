package com.example.test_rest2db_h2.controller;

import com.example.test_rest2db_h2.entity.Student;
import com.example.test_rest2db_h2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private StudentService studendtServise;

    @GetMapping("/students")
    public List<Student> showAllStudents(){
        List<Student> allStudent = studendtServise.getAllStudents();
        return allStudent;
    }
    @GetMapping("/students/{id}")
    public Student getStudent (@PathVariable ("id")int id){
        return studendtServise.getStudents(id);
    }
    @PostMapping("/students")
    public Student saveStudent (@RequestBody Student student){
        return studendtServise.saveStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent (@RequestBody Student student){
        studendtServise.saveStudent(student);
        return student;
    }
    @DeleteMapping("/students/{id}")
    public void updateStudent (@PathVariable ("id") int id){
        studendtServise.deleteStudent(id);
    }
}
