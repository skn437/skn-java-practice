package com.main.bill;

public class Item {

  private String name;
  private double price;
  private int count;

  public Item() {
    this.name = "";
    this.price = 0.0;
    this.count = 0;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String value) {
    this.name = value;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double value) {
    this.price = value;
  }

  public int getCount() {
    return this.count;
  }

  public void setCount(int value) {
    this.count = value;
  }
}
