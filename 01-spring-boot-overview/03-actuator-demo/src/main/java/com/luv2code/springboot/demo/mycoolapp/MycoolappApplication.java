package com.luv2code.springboot.demo.mycoolapp;

import com.luv2code.springboot.demo.mycoolapp.db.daos.StudentDAO;
import com.luv2code.springboot.demo.mycoolapp.db.entities.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication(scanBasePackages = {"com.luv2code.springboot.demo", "com.luv2code.springboot.utils"})
public class MycoolappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycoolappApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            List<Student> students = readStudents(studentDAO);
            Student student = readStudentById(3, studentDAO);
            System.out.println("List Of All Students");
            for(Student s : students) {
                System.out.println(s);
            }

            System.out.println("Student By ID: " + student);
        };
    }

    private void createStudent(StudentDAO studentDAO) {

    }

    private Student readStudentById(int id, StudentDAO studentDAO) {
        return studentDAO.getById(id);
    }

    private List<Student> readStudents(StudentDAO studentDAO) {
       return studentDAO.findAll();
    }


}
