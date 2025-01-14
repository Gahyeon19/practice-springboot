package com.example.springsample.students.repository;

import com.example.springsample.students.domain.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StudentRepositoryMapImplTest {
    StudentRepositoryMapImpl map = new StudentRepositoryMapImpl();

    @Test
    void findAll() {
        //given
        Student s = new Student(0, "Kim Cheolsoo", "Seoul", "2001-01-01", "kim@naver.com");
        map.addStudent(s);
        //when
        List<Student> all = map.findAll();

        //then
//        assertEquals(all.size(), 2);    //expected 값 : all.size(), actual 값: 2   => 두 값이 일치하면 성공, 일치하지 않으면 에러 발생
        assertThat(all.size()).isEqualTo(2);
    }

    @Test
    void findById() {
        //given
        Student s = new Student(0, "Park James", "kosta", "2000-01-01", "park@naver.com");

        //when
        int id = map.addStudent(s);

        //then
        assertThat(map.findById(id).getName()).isEqualTo(s.getName());
    }

    @Test
    void updateStudent() {
    }

    @Test
    void addStudent() {
    }

    @Test
    void deleteStudent() {
    }
}