package com.main;

import java.util.Arrays;

public class App5 {

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4 };

    for (int number : numbers) {
      System.out.println(number);
    }

    String[] names = { "SKN", "Wang So", "Geralt" };

    Arrays.fill(names, 1, 2, "skn437");

    System.out.printf("names Array: %s\n", Arrays.toString(names));
  }
}
