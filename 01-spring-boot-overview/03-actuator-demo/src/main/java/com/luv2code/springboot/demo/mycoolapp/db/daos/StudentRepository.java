package com.luv2code.springboot.demo.mycoolapp.db.daos;

import com.luv2code.springboot.demo.mycoolapp.db.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {}
