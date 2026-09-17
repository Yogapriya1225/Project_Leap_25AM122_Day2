package com.example.DBconnect.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DBconnect.Model.Student;
import com.example.DBconnect.Repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public Student saveStudent(Student student){
        return repository.save(student);
    }

}
