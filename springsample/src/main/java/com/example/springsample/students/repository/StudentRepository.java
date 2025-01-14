package com.example.springsample.students.repository;

import com.example.springsample.students.domain.Student;
import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student findById(int id);
    void updateStudent(Student student);
    int addStudent(Student student);
    void deleteStudent(int id);
}
