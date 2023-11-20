package com.main.inventory;

public class Main {

  public static void main(String[] args) {
    Inventory sknInventory = new Inventory();
    Product book = new Product("Himu Samagra", 2);
    Product cigarette = new Product("Benson & Hedges Breeze", 1);

    sknInventory.addProduct(book);
    sknInventory.addProduct(cigarette);

    System.out.printf(
      "The products in your inventory: %s\n",
      sknInventory.getProducts().toString()
    );

    sknInventory.checkLowInventory();
  }
}
