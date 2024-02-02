package com.main.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SortMap {

  public static List<String> sortMapKeys(Map<String, String> optionMap) {
    List<String> keys = new ArrayList<String>();

    for (Map.Entry<String, String> entry : optionMap.entrySet()) {
      keys.add(entry.getKey());
    }

    Collections.sort(keys); //*Sort for List */

    return keys;
  }
}
