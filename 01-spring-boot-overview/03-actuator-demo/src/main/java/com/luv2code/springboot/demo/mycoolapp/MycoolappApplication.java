package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {"com.luv2code.springboot.demo", "com.luv2code.springboot.utils"})
public class MycoolappApplication {

  public static void main(String[] args) {
    SpringApplication.run(MycoolappApplication.class, args);
  }
}
