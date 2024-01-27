package com.main.time;

public class Main {

  public static void main(String[] args) {
    Time time = new Time("2023-02-04");

    System.out.printf("Date: %s \n", time.getDate().toString());
    System.out.printf("Year: %s \n", time.getDate().getYear()); //* 2023
    System.out.printf("Month: %s \n", time.getDate().getMonth()); //* February
    System.out.printf("Date: %s \n", time.getDate().getDayOfMonth()); //* Date: 4
    System.out.printf("Day: %s \n", time.getDate().getDayOfWeek()); //* Day: Saturday
  }
}
