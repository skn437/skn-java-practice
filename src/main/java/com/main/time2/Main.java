package com.main.time2;

public class Main {

  public static void main(String[] args) {
    Time time = new Time("07:30:10");

    System.out.printf("Time: %s \n", time.getTime().toString());
    System.out.printf("Hour: %s \n", time.getTime().getHour());
    System.out.printf("Minute: %s \n", time.getTime().getMinute());
    System.out.printf("Second: %s \n", time.getTime().getSecond());
  }
}
