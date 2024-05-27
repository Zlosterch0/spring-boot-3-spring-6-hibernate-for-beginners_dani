package com.luv2code.springboot.demo.mycoolapp.services;

import com.luv2code.springboot.demo.mycoolapp.db.daos.StudentRepository;
import com.luv2code.springboot.demo.mycoolapp.db.entities.Student;
import com.luv2code.springboot.demo.mycoolapp.exceptions.NegativeStudentIdException;
import com.luv2code.springboot.demo.mycoolapp.exceptions.StudentNotFoundException;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService {
  private final StudentRepository studentRepository;

  @Autowired
  public StudentServiceImplementation(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Transactional
  @Override
  public Student save(Student student) {
    return studentRepository.save(student);
  }

  @Transactional
  @Override
  public void deleteById(int id) {
    if (id < 0) {
      throw new NegativeStudentIdException("Negative student id!");
    }
    studentRepository.deleteById(id);
  }

  @Override
  public Student getById(int id) {
    Student s = studentRepository.findById(id).orElse(null);
    if (s == null) {
      throw new StudentNotFoundException("Student with id " + id + " not found!");
    }
    return s;
  }

  @Override
  public List<Student> findAll() {
    return studentRepository.findAll();
  }
}
