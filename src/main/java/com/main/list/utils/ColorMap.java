package com.main.list.utils;

import java.util.HashMap;
import java.util.Map;

public class ColorMap {

  public static enum ColorName {
    RESET,
    GREEN,
  }

  private static final Map<ColorMap.ColorName, String> colorMap = new HashMap<ColorMap.ColorName, String>() {
    {
      put(ColorName.RESET, "\033[0m");
      put(ColorName.GREEN, "\033[0;32m");
    }
  };

  public static String getColor(ColorMap.ColorName color) {
    return colorMap.get(color);
  }
}
