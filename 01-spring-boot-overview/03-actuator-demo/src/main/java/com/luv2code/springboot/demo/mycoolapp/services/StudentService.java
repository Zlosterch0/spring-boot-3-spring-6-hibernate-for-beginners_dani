package com.luv2code.springboot.demo.mycoolapp.services;

import com.luv2code.springboot.demo.mycoolapp.db.entities.Student;
import java.util.List;

public interface StudentService {

  Student save(Student student);

  void deleteById(int id);

  Student getById(int id);

  List<Student> findAll();
}
