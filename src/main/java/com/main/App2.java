package com.main;

import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a Double: ");
    double input1 = scanner.nextDouble();

    System.out.print("Enter another Double: ");
    double input2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.printf("Addition: %f\n", input1 + input2);

    System.out.print("Now enter a word: ");
    String word = scanner.nextLine();

    System.out.printf("You entered %s", word);

    scanner.close();
  }
}
