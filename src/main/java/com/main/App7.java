package com.main;

import java.util.HashMap;

public class App7 {

  public static void main(String[] args) {
    HashMap<String, Integer> numbers = new HashMap<String, Integer>();

    numbers.put("SKN", 100);
    numbers.put("Wang_So", 90);
    numbers.put("Geralt", 75);

    System.out.printf("numbers: %s\n", numbers); // Like ArrayList, HashMap can be printed directly

    System.out.printf("Item Value no 2: %s\n", numbers.get("Wang_So")); // get by key

    numbers.putIfAbsent("Akaza", 60); // If the key is already present, then it will be ignored.

    System.out.printf("New numbers: %s\n", numbers);

    numbers.replace("Akaza", 60, 70); // If the old value is wrong then it won't update

    System.out.printf("New numbers now: %s\n", numbers);

    numbers.remove("Akaza");

    System.out.printf("New numbers after removal: %s\n", numbers);

    boolean check = numbers.containsKey("Akaza");

    System.out.printf("Akaza is present: %b\n", check);

    boolean check2 = numbers.containsValue(70);

    System.out.printf("Number 70 is present: %b\n", check2);

    boolean check3 = numbers.isEmpty();

    System.out.printf("numbers Hash Map Is Empty: %b\n", check3);

    System.out.printf("numbers hashmap size: %d\n", numbers.size());

    numbers.forEach((key, value) -> numbers.replace(key, value * 2));

    System.out.printf("New numbers: %s\n", numbers);
  }
}
