package com.main.travelapp;

import java.time.LocalDate;

abstract interface FlightInterface {
  public String getFlightNumber();

  public String getPassengerName();

  public String getOrigin();

  public String getDestination();

  public String getDate();

  public int getNumPassengers();

  public double getPrice();

  public String getConfirmationNumber();

  public void setConfirmationNumber(String confirmationNumber);
}

public class Flight implements FlightInterface {

  private String flightNumber;
  private String passengerName;
  private String origin;
  private String destination;
  private LocalDate date;
  private int numPassengers;
  private double price;
  private String confirmationNumber;

  public Flight(
    String flightNumber,
    String passengerName,
    String origin,
    String destination,
    LocalDate date,
    int numPassengers,
    double price
  ) {
    this.flightNumber = flightNumber;
    this.passengerName = passengerName;
    this.origin = origin;
    this.destination = destination;
    this.date = date;
    this.numPassengers = numPassengers;
    this.price = price;
  }

  public String getFlightNumber() {
    return this.flightNumber;
  }

  public String getPassengerName() {
    return this.passengerName;
  }

  public String getOrigin() {
    return this.origin;
  }

  public String getDestination() {
    return this.destination;
  }

  public String getDate() {
    return this.date.toString();
  }

  public int getNumPassengers() {
    return this.numPassengers;
  }

  public double getPrice() {
    return this.price;
  }

  public String getConfirmationNumber() {
    return this.confirmationNumber;
  }

  public void setConfirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }
}
