package com.main.airplane;

import java.time.LocalTime;

abstract interface AirplaneInterface {
  public String getFlightNumber();

  public String getDestination();

  public void setDestination(String destination);

  public String getDepartureTime();

  public void setDepartureTime(String departureTime);

  public int getDelayTime();

  public void delay(int minutes);

  public void checkStatus();
}

public class Airplane implements AirplaneInterface {

  private String flightNumber;
  private String destination;
  private LocalTime departureTime;
  private int delayTime;

  public Airplane(
    String flightNumber,
    String destination,
    String departureTime
  ) {
    this.flightNumber = flightNumber;
    this.destination = destination;
    this.departureTime = LocalTime.parse(departureTime);
    this.delayTime = 0;
  }

  public String getFlightNumber() {
    return this.flightNumber;
  }

  public String getDestination() {
    return this.destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDepartureTime() {
    return this.departureTime.toString();
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = LocalTime.parse(departureTime);
  }

  public int getDelayTime() {
    return this.delayTime;
  }

  public void delay(int minutes) {
    this.delayTime = minutes;
    this.departureTime = this.departureTime.plusMinutes(minutes);
  }

  public void checkStatus() {
    if (this.delayTime == 0) {
      System.out.printf(
        "Flight Number %s is on time & will depart at %s\n",
        this.flightNumber,
        this.departureTime.toString()
      );
    } else {
      System.out.printf(
        "Flight Number %s is delayed by %d minutes & will depart at %s\n",
        this.flightNumber,
        this.delayTime,
        this.departureTime.toString()
      );
    }
  }
}
