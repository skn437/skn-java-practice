package com.main.time;

import java.time.LocalDate;

public class Time {

  private LocalDate date;

  public Time(String dateString) {
    this.date = LocalDate.parse(dateString);
  }

  public LocalDate getDate() {
    return this.date;
  }
}
