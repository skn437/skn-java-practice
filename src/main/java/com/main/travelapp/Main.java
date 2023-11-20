package com.main.travelapp;

public class Main {

  public static void main(String[] args) {
    TravelApp travelApp = new TravelApp();

    travelApp.searchFlights("Dhaka", "Coimbatore", "2023-10-26", 1);
    travelApp.searchHotels("Coimbatore", "2023-10-27", "2023-11-07", 1);

    travelApp.bookFlight(
      "BX974AJ",
      "SKN",
      "Dhaka",
      "Coimbatore",
      "2023-10-26",
      1,
      250
    );
    travelApp.bookHotel(
      "BGJ467D",
      "SKN",
      "Coimbatore",
      "2023-10-27",
      "2023-11-07",
      1,
      144
    );
    travelApp.bookHotel(
      "DGH678I",
      "SKN",
      "Chennai",
      "2023-11-07",
      "2023-11-15",
      1,
      160
    );

    travelApp.cancelHotelBooking("2f91302065ec46af8b977e2365a5c015");
  }
}
