package com.luv2code.springboot.demo.mycoolapp.exceptions;

public class NegativeStudentIdException extends RuntimeException{

    public NegativeStudentIdException(String message){
        super(message);
    }

}
