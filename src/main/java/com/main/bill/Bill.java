package com.main.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

  private String title;
  private List<Item> items;
  private double tip;

  public Bill() {
    this.items = new ArrayList<Item>();
    this.title = "";
    this.tip = 0.0;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String value) {
    this.title = value;
  }

  public List<Item> getItems() {
    return this.items;
  }

  public void setItems(List<Item> value) {
    this.items = value;
  }

  public void addItem(Item value) {
    this.items.add(value);
  }

  public double getTip() {
    return this.tip;
  }

  public void setTip(double value) {
    this.tip = value;
  }

  public String format() {
    String formattedString = String.format("Bill Info: %s \n", this.title);

    double total = 0.0;

    for (Item item : this.items) {
      double subTotal = item.getPrice() * item.getCount();

      formattedString +=
        String.format("%-25s %f$ \n", item.getName() + ":", subTotal);

      total += subTotal;
    }

    total += this.tip;

    formattedString += String.format("%-25s %f$ \n", "Tip:", this.tip);
    formattedString += String.format("%-25s %f$", "Total:", total);

    return formattedString;
  }
}
