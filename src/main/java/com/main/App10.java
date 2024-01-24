package com.main;

import java.util.ArrayList;
import java.util.List;

public class App10 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();

    for (int i = 0; i < 7; i++) {
      numbers.add(i + 1);
    }

    System.out.println(numbers);

    numbers.remove(6);
    numbers.set(0, Integer.valueOf(100));

    System.out.println(numbers);

    boolean check = numbers.contains(Integer.valueOf(6));

    System.out.printf("Check: %b \n", check);

    //* Change All Values At Once
    numbers.forEach(number -> {
      numbers.set(numbers.indexOf(number), number * 2);
      System.out.printf("Number Index: %d \n", numbers.indexOf(number));
    });

    System.out.println(numbers);
  }
}
