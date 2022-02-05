package com.sun.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// http://localhost:8081/

@SpringBootApplication
public class EntryPoint {
  public static void main(String[] args) {
     SpringApplication.run(EntryPoint.class, args);
  }
}

