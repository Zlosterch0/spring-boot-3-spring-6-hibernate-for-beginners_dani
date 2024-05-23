package com.luv2code.springboot.demo.mycoolapp.exceptions;

public class StudentNotFoundException extends RuntimeException {

  public StudentNotFoundException(String message) {
    super(message);
  }
}
