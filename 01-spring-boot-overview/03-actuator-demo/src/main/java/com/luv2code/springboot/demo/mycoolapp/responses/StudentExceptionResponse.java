package com.luv2code.springboot.demo.mycoolapp.responses;

import org.springframework.http.HttpStatus;

public class StudentExceptionResponse {
  private final HttpStatus code;
  private final String message;
  private final long timestamp;

  public StudentExceptionResponse(HttpStatus code, String message) {
    this.code = code;
    this.message = message;
    this.timestamp = System.currentTimeMillis();
  }

  public String getMessage() {
    return message;
  }

  public HttpStatus getCode() {
    return code;
  }

  public long getTimestamp() {
    return timestamp;
  }
}
