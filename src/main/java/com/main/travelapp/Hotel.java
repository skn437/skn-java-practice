package com.main.travelapp;

import java.time.LocalDate;

abstract interface HotelInterface {
  public String getHotelId();

  public String getName();

  public String getLocation();

  public String getCheckInTime();

  public String getCheckOutTime();

  public int getGuestsNumber();

  public double getPrice();

  public String getConfirmationNumber();

  public void setConfirmationNumber(String confirmationNumber);
}

public class Hotel implements HotelInterface {

  private String hotelId;
  private String name;
  private String location;
  private LocalDate checkIn;
  private LocalDate checkOut;
  private int guestsNumber;
  private double price;
  private String confirmationNumber;

  public Hotel(
    String hotelId,
    String name,
    String location,
    String checkIn,
    String checkOut,
    int guestsNumber,
    double price
  ) {
    this.hotelId = hotelId;
    this.name = name;
    this.location = location;
    this.checkIn = LocalDate.parse(checkIn);
    this.checkOut = LocalDate.parse(checkOut);
    this.guestsNumber = guestsNumber;
    this.price = price;
  }

  public String getHotelId() {
    return this.hotelId;
  }

  public String getName() {
    return this.name;
  }

  public String getLocation() {
    return this.location;
  }

  public String getCheckInTime() {
    return this.checkIn.toString();
  }

  public String getCheckOutTime() {
    return this.checkOut.toString();
  }

  public int getGuestsNumber() {
    return this.guestsNumber;
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
