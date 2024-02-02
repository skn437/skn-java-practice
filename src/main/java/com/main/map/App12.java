package com.main.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//* Printing Maps In Order
/*
 * Hello
 */
public class App12 {

  public static void main(String[] args) {
    //* This type of initialization is immutable, so it's good to go
    Map<String, String> optionMap = new HashMap<String, String>() {
      {
        put("a", "Linux");
        put("b", "Project Root");
        put("c", "Spring Boot API");
        put("d", "Svelte Kit");
        put("z", "Docker");
        put("f", "Kubernetes");
      }
    };

    optionMap.put("x", "Exit");

    optionMap.forEach((key, value) -> {
      System.out.printf("Key: %s, Value: %s \n", key, value);
    });

    List<String> keys = SortMap.sortMapKeys(optionMap);

    System.out.printf("%s \n", keys);

    for (String key : keys) {
      System.out.printf("Key: %s, Value: %s \n", key, optionMap.get(key));
    }
  }
}
