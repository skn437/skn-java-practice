package com.main;

import java.util.HashMap;
import java.util.Map;

//* Map Practice
public class App11 {

  public static void main(String[] args) {
    Map<String, Integer> scores = new HashMap<String, Integer>();

    scores.put("Math", 100);
    scores.put("Physics", 99);
    scores.put("History", 88);

    //scores.clear(); //* Clears out the entire map
    scores.put("Philosophy", 80);
    scores.replace("Math", 99, 90); //* If the old value is wrong, then the new value won't be updated

    System.out.printf("Scores: %s \n", scores); //* Printing Hash Map may give out of order pairs

    System.out.printf("Key Sets: %s \n", scores.keySet()); //* It's a Set
    System.out.printf("Value Sets: %s \n", scores.values()); //* It's a Set
    System.out.printf("Length: %s \n", scores.size()); //* Map size

    System.out.printf("CSE is present: %b \n", scores.containsKey("CSE")); //* Checking if a key is present
    System.out.printf("100 score is present: %b \n", scores.containsValue(100)); //* Checking if a value is present

    scores.forEach((subject, score) -> {
      System.out.printf("%-25s %d \n", subject + ":", score);
    });

    int total = 0;

    for (int value : scores.values()) {
      System.out.printf("Value: %d \n", value);
      total += value;
    }

    System.out.printf("Total: %d \n", total);

    //* This is how a map is iterated over
    for (Map.Entry<String, Integer> entry : scores.entrySet()) {
      System.out.printf(
        "Key: %s, Value: %d \n",
        entry.getKey(),
        entry.getValue()
      );
    }

    System.out.printf("Entry Set: %s \n", scores.entrySet());
  }
}
