package com.main.travelapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

abstract interface TravelAppInterface {
  public void searchFlights(
    String origin,
    String destination,
    String date,
    int numPassengers
  );

  public void searchHotels(
    String location,
    String checkIn,
    String checkOut,
    int guestsNumber
  );

  public void bookFlight(
    String flightNumber,
    String passengerName,
    String origin,
    String destination,
    String date,
    int numPassengers,
    double price
  );

  public void bookHotel(
    String hotelId,
    String name,
    String location,
    String checkIn,
    String checkOut,
    int guestsNumber,
    double price
  );

  public void cancelFlightBooking(String confirmationNumber);

  public void cancelHotelBooking(String confirmationNumber);
}

public class TravelApp implements TravelAppInterface {

  private List<Flight> flights;
  private List<Hotel> hotels;

  public TravelApp() {
    this.flights = new ArrayList<Flight>();
    this.hotels = new ArrayList<Hotel>();
  }

  public void searchFlights(
    String origin,
    String destination,
    String date,
    int numPassengers
  ) {
    System.out.printf(
      "Searching for flights from %s to %s on %s for %d passenger(s)...\n",
      origin,
      destination,
      date,
      numPassengers
    );
  }

  public void searchHotels(
    String location,
    String checkIn,
    String checkOut,
    int guestsNumber
  ) {
    System.out.printf(
      "Searching for hotels in %s from %s to %s for %d guest(s)...\n",
      location,
      checkIn,
      checkOut,
      guestsNumber
    );
  }

  public void bookFlight(
    String flightNumber,
    String passengerName,
    String origin,
    String destination,
    String date,
    int numPassengers,
    double price
  ) {
    Flight flight = new Flight(
      flightNumber,
      passengerName,
      origin,
      destination,
      LocalDate.parse(date),
      numPassengers,
      price
    );

    String confirmationNumber = UUID
      .randomUUID()
      .toString()
      .replaceAll("-", "");

    flight.setConfirmationNumber(confirmationNumber);

    this.flights.add(flight);

    System.out.printf(
      "Flight Booked! Confirmation no: %s\n",
      flight.getConfirmationNumber()
    );
  }

  public void bookHotel(
    String hotelId,
    String name,
    String location,
    String checkIn,
    String checkOut,
    int guestsNumber,
    double price
  ) {
    Hotel hotel = new Hotel(
      hotelId,
      name,
      location,
      checkIn,
      checkOut,
      guestsNumber,
      price
    );

    String confirmationNumber = UUID
      .randomUUID()
      .toString()
      .replaceAll("-", "");

    hotel.setConfirmationNumber(confirmationNumber);

    this.hotels.add(hotel);

    System.out.printf(
      "Hotel Booked! Confirmation no: %s\n",
      hotel.getConfirmationNumber()
    );
  }

  public void cancelFlightBooking(String confirmationNumber) {
    for (Flight flight : this.flights) {
      if (flight.getConfirmationNumber() == confirmationNumber) {
        this.flights.remove(flight);
        System.out.printf(
          "Flight reservation with confirmation number: %s has been cancelled!\n",
          confirmationNumber
        );
        return;
      }
    }

    System.out.printf(
      "You have no booking by checking number: %s\n",
      confirmationNumber
    );
  }

  public void cancelHotelBooking(String confirmationNumber) {
    for (Hotel hotel : this.hotels) {
      if (hotel.getConfirmationNumber() == confirmationNumber) {
        this.hotels.remove(hotel);
        System.out.printf(
          "Hotel reservation with confirmation number: %s has been cancelled!\n"
        );
        return;
      }
    }

    System.out.printf(
      "You have no booking by checking number: %s\n",
      confirmationNumber
    );
  }
}
