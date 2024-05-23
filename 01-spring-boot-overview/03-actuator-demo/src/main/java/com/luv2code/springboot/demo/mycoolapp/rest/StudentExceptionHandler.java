package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.responses.StudentExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler {

  @ExceptionHandler()
  public ResponseEntity<StudentExceptionResponse> handleException(Exception ex) {
    StudentExceptionResponse response =
        new StudentExceptionResponse(HttpStatus.NOT_FOUND, ex.getMessage());
    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
  }
}
