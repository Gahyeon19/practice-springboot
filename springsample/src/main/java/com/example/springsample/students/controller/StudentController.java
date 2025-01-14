package com.example.springsample.students.controller;

import com.example.springsample.students.domain.Student;
import com.example.springsample.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student) {    //'/students/1' 수정
        Student student1 = studentService.updateOldStudent(id, student);
        return student1;
    }

    @PatchMapping("/{id}")
    public Student updateStudent2(@PathVariable("id") int id, @RequestBody Student student) {    //'/students/1' 수정
        Student student1 = studentService.updateOldStudent(id, student);
        return student1;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {  //'/students'   추가
        Student student1 = studentService.addNewStudent(student);
        return student1;
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") int id) {   //'/students/1'   삭제
        studentService.deleteOldStudent(id);
    }
}
