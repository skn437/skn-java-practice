package com.main.restaurant;

public class Main {

  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();

    restaurant.addItem("Pizza", 10.99);
    restaurant.addItem("Burger", 8.99);
    restaurant.addItem("Vegetable Rice", 19.99);

    restaurant.displayMenu();

    restaurant.getAverageRating("Noodles");

    restaurant.addRating("Pizza", 5);
    restaurant.addRating("Pizza", 4);
    restaurant.addRating("Pizza", 3);

    restaurant.addRating("Burger", 4);

    System.out.printf(
      "The ratings of Pizza: %.2f\n",
      restaurant.getAverageRating("Pizza")
    );
    System.out.printf(
      "The ratings of Burger: %.2f\n",
      restaurant.getAverageRating("Burger")
    );
    System.out.printf(
      "The ratings of Vegetable Rice: %.2f\n",
      restaurant.getAverageRating("Vegetable Rice")
    );
  }
}
