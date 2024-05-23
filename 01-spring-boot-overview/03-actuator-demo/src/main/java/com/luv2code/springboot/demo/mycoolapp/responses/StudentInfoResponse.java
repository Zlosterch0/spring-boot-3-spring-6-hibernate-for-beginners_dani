package com.luv2code.springboot.demo.mycoolapp.responses;

import com.luv2code.springboot.demo.mycoolapp.db.entities.Student;

public class StudentInfoResponse implements BasicResponse {
  private String message;
  private int statusCode = 200;

  @Override
  public void setMessage(Object data) {
    if (data == null) {
      this.message = "Student Info is null";
      this.statusCode = 503;
      return;
    }
    Student student = (Student) data;
    this.message =
        "name: "
            + student.getFirstName()
            + ", lastName: "
            + student.getLastName()
            + ", email: "
            + student.getEmail();
  }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    @Override
  public String toString() {
    return "StudentInfoResponse{"
        + "message='"
        + message
        + '\''
        + ", statusCode="
        + statusCode
        + '}';
  }
}
