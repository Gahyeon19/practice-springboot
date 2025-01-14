package com.example.springsample.students.repository;

import com.example.springsample.students.domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository
public class StudentRepositoryMapImpl implements StudentRepository{
    private Map<Integer, Student> students;
    private int seq = 1;

    public StudentRepositoryMapImpl() {
        students = new HashMap<Integer, Student>();
        Student s = new Student(seq++, "Hong Gildong", "Hankook", "2002-02-02", "hong@naver.com");
        students.put(s.getId(), s);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }

    @Override
    public void updateStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public int addStudent(Student student) {
        student.setId(seq++);
        students.put(student.getId(), student);
        return student.getId();
    }

    @Override
    public void deleteStudent(int id) {
        students.remove(id);
    }
}
