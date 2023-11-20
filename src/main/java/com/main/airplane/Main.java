package com.main.airplane;

public class Main {

  public static void main(String[] args) {
    Airplane indigo = new Airplane("B1X437", "Coimbatore", "10:30");

    System.out.printf(
      "Flight Number: %s has scheduled time at %s\n",
      indigo.getFlightNumber(),
      indigo.getDepartureTime()
    );

    indigo.delay(12);

    indigo.checkStatus();
  }
}
