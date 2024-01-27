package com.main.time3;

import java.time.LocalDateTime;

public class Time {

  private LocalDateTime dateTime;

  public Time(String dateTimeString) {
    this.dateTime = LocalDateTime.parse(dateTimeString);
  }

  public LocalDateTime getDateTime() {
    return this.dateTime;
  }
}
