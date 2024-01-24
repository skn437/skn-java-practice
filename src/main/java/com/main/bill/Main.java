package com.main.bill;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Title: ");

    Bill bill = new Bill();
    bill.setTitle(scanner.nextLine());

    System.out.printf("New Bill Created With Title: %s \n", bill.getTitle());

    String options =
      """
        Choose an option:
        (a) Press 'a' for adding items
        (b) Press 't' for adding tip
        (c) Press 's' for saving the bill
        Your Selection:
        """;

    String selection = "";

    while (true) {
      System.out.print(options);
      selection = scanner.nextLine();

      switch (selection) {
        case "a":
          Item item = new Item();

          System.out.print("Enter Item Name: ");
          item.setName(scanner.nextLine());

          System.out.print("Enter Item price: ");
          item.setPrice(Double.parseDouble(scanner.nextLine()));

          System.out.print("Enter Item Count: ");
          item.setCount(Integer.parseInt(scanner.nextLine()));

          bill.addItem(item);
          continue;
        case "t":
          System.out.print("Enter Tip: ");
          bill.setTip(Double.parseDouble(scanner.nextLine()));
          continue;
        case "s":
          System.out.println("Bill Saved!");
          System.out.println(bill.format());
          break;
        default:
          System.out.println("Invalid Selection");
          continue;
      }

      break;
    }

    scanner.close();
  }
}
