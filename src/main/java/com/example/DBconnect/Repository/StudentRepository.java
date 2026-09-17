package com.example.DBconnect.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.DBconnect.Model.Student;
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
