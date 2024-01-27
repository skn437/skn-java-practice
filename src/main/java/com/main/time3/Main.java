package com.main.time3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String[] args) {
    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter formattedDateTimeObject = DateTimeFormatter.ofPattern(
      "yyyy-MM-dd HH:mm:ss"
    );

    String formattedDateTime = formattedDateTimeObject.format(time);

    System.out.printf("Date Time %s \n", formattedDateTime);
  }
}
