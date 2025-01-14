package com.example.springsample.students.service;

import com.example.springsample.students.domain.Student;
import com.example.springsample.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Student getStudentById(int id){
        return repository.findById(id);
    }

    public Student addNewStudent(Student student){
        int id = repository.addStudent(student);
        student.setId(id);
        return student;
    }

    public Student updateOldStudent(int id, Student student){
        Student oldStudent = repository.findById(id);
        if (student.getUniv() != null){
            oldStudent.setUniv(student.getUniv());
        }
        if (student.getEmail() != null){
            oldStudent.setEmail(student.getEmail());
        }

        repository.updateStudent(oldStudent);
        return oldStudent;
    }

    public void deleteOldStudent(int id){
        repository.deleteStudent(id);
    }
}
