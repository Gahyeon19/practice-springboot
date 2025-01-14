package com.example.springsample.students.service;

import com.example.springsample.students.domain.Student;
import com.example.springsample.students.repository.StudentRepository;
import com.example.springsample.students.repository.StudentRepositoryMapImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    StudentRepository repository = new StudentRepositoryMapImpl();
    StudentService service = new StudentService(repository);

    @Test
    void getAllStudents() {
        //given

        //when
        List<Student> allStudents = service.getAllStudents();

        //then
        Assertions.assertThat(allStudents.size()).isEqualTo(1);
    }

    @Test
    void getStudentById() {
    }

    @Test
    void addNewStudent() {
    }

    @Test
    void updateOldStudent() {
    }

    @Test
    void deleteOldStudent() {
    }
}