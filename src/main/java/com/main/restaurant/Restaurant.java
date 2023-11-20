package com.main.restaurant;

import java.util.ArrayList;
import java.util.List;

abstract interface RestaurantInterface {
  public void addItem(String item, double price);

  public void removeItem(String item);

  public void addRating(String item, int rating);

  public double getAverageRating(String item);

  public void displayMenu();
}

public class Restaurant implements RestaurantInterface {

  private List<String> menuItems;
  private List<Double> prices;
  private List<Integer> ratingCounts;
  private List<Integer> ratings;

  public Restaurant() {
    this.menuItems = new ArrayList<String>();
    this.prices = new ArrayList<Double>();
    this.ratingCounts = new ArrayList<Integer>();
    this.ratings = new ArrayList<Integer>();
  }

  public void addItem(String item, double price) {
    this.menuItems.add(item);
    this.prices.add(price);
    this.ratingCounts.add(0);
    this.ratings.add(0);
  }

  public void removeItem(String item) {
    int index = this.menuItems.indexOf(item);

    if (index >= 0) {
      this.menuItems.remove(index);
      this.prices.remove(index);
      this.ratingCounts.remove(index);
      this.ratings.remove(index);
      return;
    }

    System.out.printf(
      "Cannot Remove Item: %s as it doesn't exist in the menu!\n",
      item
    );
  }

  public void addRating(String item, int rating) {
    int index = this.menuItems.indexOf(item);

    if (index >= 0) {
      int currentRating = this.ratings.get(index);
      this.ratings.set(index, currentRating + rating);

      int currentRatingCount = this.ratingCounts.get(index);
      this.ratingCounts.set(index, ++currentRatingCount);

      return;
    }

    System.out.printf("Item: %s doesn't exist in the menu!\n", item);
  }

  public double getAverageRating(String item) {
    int index = this.menuItems.indexOf(item);

    if (index >= 0) {
      int currentRating = this.ratings.get(index);
      int currentRatingCount = this.ratingCounts.get(index);

      double average = (currentRatingCount > 0)
        ? (double) (currentRating / currentRatingCount)
        : 0.0;

      return average;
    }

    System.out.printf("Item: %s doesn't exist in the menu!\n", item);
    return 0.0;
  }

  public void displayMenu() {
    System.out.printf("Menu:\n");

    for (int i = 0; i < this.menuItems.size(); i++) {
      System.out.printf(
        "%s: $%.2f\n",
        this.menuItems.get(i),
        this.prices.get(i)
      );
    }
  }
}
