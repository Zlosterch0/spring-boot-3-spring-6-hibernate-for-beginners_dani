package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.db.entities.Student;
import com.luv2code.springboot.demo.mycoolapp.services.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
  private StudentService studentService;

  @Autowired
  public StudentRestController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/students/")
  public List<Student> getAllStudents() {
    return studentService.findAll();
  }

  @GetMapping("/students/{studentId}")
  public Student getAllStudents(@PathVariable int studentId) {
    return studentService.getById(studentId);
  }

  @DeleteMapping("/students/{studentId}")
  public void deleteStudent(@PathVariable int studentId) {
    studentService.deleteById(studentId);
  }

  @PostMapping("/students/")
  public Student createStudent(@RequestBody Student student) {
    student.setId(0);
    Student s = studentService.save(student);
    return s;
  }

  @PutMapping("/students/")
  public Student updateStudent(@RequestBody Student student) {
    Student s = studentService.save(student);
    return s;
  }
}
