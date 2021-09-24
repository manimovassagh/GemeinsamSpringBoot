package com.github.manimovassagh.crudsample.controller;


import com.github.manimovassagh.crudsample.entity.Student;
import com.github.manimovassagh.crudsample.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public List<Student> findAllStudents() {
       return  studentRepository.findAll();
    }



}
