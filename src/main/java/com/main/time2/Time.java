package com.main.time2;

import java.time.LocalTime;

public class Time {

  private LocalTime localTime;

  public Time(String localTimeString) {
    this.localTime = LocalTime.parse(localTimeString);
  }

  public LocalTime getTime() {
    return this.localTime;
  }
}
