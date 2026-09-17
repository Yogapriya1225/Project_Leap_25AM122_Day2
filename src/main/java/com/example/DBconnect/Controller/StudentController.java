package com.example.DBconnect.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.DBconnect.Model.Student;
import com.example.DBconnect.Service.StudentService;
@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
}
