package com.spring.spring_demo;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;


@Component 
@Lazy 

public class SeniorHighStudent implements Student{

  public SeniorHighStudent(){
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override 
  public String getDailyAssignment() {
    return "Wag na magcollege";
  }

}
