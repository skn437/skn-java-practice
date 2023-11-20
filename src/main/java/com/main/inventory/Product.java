package com.main.inventory;

abstract interface ProductInterface {
  public String getName();

  public void setName(String name);

  public int getQuantity();

  public void setQuantity(int quantity);
}

public class Product implements ProductInterface {

  private String name;
  private int quantity;

  public Product(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String toString() {
    return String.format("%s", this.name);
  }
}
