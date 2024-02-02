package com.main.list.utils;

import com.main.list.utils.ColorMap.ColorName;

public class Color {

  public static String green(String text) {
    return String.format(
      "%s%s%s",
      ColorMap.getColor(ColorName.GREEN),
      text,
      ColorMap.getColor(ColorName.RESET)
    );
  }
}
