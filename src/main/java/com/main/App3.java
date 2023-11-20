package com.main;

import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int input1 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter second integer: ");
    int input2 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("What do you want to do?");

    System.out.println(
      "Type 'sum' for 'Summation', 'sub' for 'Subtraction', 'mult' for 'Multiplication' & 'div' for 'Division'"
    );

    System.out.print("Your choice: ");
    String choice = scanner.nextLine();

    switch (choice) {
      case "sum":
        System.out.printf("%d + %d = %d", input1, input2, input1 + input2);
        break;
      case "sub":
        System.out.printf("%d - %d = %d", input1, input2, input1 - input2);
        break;
      case "mult":
        System.out.printf("%d x %d = %d", input1, input2, input1 * input2);
        break;
      case "div":
        if (input2 == 0) {
          System.out.print("Sorry! Cannot divide by Zero");
          break;
        }
        System.out.printf("%d / %d = %d", input1, input2, input1 / input2);
        break;
      default:
        System.out.printf("%s is an invalid choice!", choice);
    }

    scanner.close();
  }
}
