package com.main.annotate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@VeryImportant
public class Skn {

  @MyName
  public String name;

  private double age;
  private String title;

  @MyHeart(times = 3)
  public void getMyHeart() {
    System.out.printf("Logno & Atoshi! \n");
  }
}
