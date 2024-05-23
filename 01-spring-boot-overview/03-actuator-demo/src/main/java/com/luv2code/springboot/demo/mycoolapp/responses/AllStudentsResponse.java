package com.luv2code.springboot.demo.mycoolapp.responses;

import com.luv2code.springboot.demo.mycoolapp.db.entities.Student;
import java.util.List;

public class AllStudentsResponse implements BasicResponse {
  private String message;
  private int statusCode = 200;

  @Override
  public void setMessage(Object data) {
    if (data == null) {
      message = "Student Not Found";
      statusCode = 503;
      return;
    }
    List<Student> students = (List<Student>) data;
    StringBuilder sb = new StringBuilder();
    for (Student student : students) {
      sb.append(
          student.getFirstName()
              + ", "
              + student.getLastName()
              + ", email:"
              + student.getEmail()
              + System.lineSeparator());
    }
    message = sb.toString();
  }

  public String getMessage() {
    return message;
  }

  public int getStatusCode() {
    return statusCode;
  }

  @Override
  public String toString() {
    return "AllStudentsResponse{"
        + "message='"
        + message
        + ", statusCode="
        + statusCode
        + '}';
  }
}
