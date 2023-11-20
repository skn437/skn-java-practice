package com.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App6 {

  public static void main(String[] args) {
    // Array List (Dynamic Array)
    // ArrayList Doesn't Take Data Types, Instead They Take The Corresponding Wrapper Class
    // Integer for int, Double for double, Float for float and so on
    List<Integer> numbers = new ArrayList<Integer>();

    numbers.add(1); // add method to push entry to an ArrayList
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    System.out.printf("numbers Array List: %s\n", numbers); // ArrayList can be printed directly
    System.out.printf("Second Entry of numbers: %d\n", numbers.get(1));

    numbers.remove(2); // This is the way to remove an element by index. Primitive Type Way.
    numbers.remove(Integer.valueOf(5)); // This is the way to remove an element by value. Reference Type Way.
    System.out.printf("numbers after removal: %s\n", numbers);

    List<Integer> numbers2 = new ArrayList<Integer>();

    for (int num = 1; num <= 9; num++) {
      numbers2.add(num);
    }

    System.out.printf("numbers2: %s\n", numbers2);

    numbers2.clear();

    System.out.printf("numbers2 after clearing: %s\n", numbers2);
    System.out.printf("numbers size: %d\n", numbers.size());

    numbers.set(2, Integer.valueOf(69));
    System.out.printf("numbers: %s\n", numbers);

    List<Integer> numbers3 = new ArrayList<Integer>();

    numbers3.add(5);
    numbers3.add(2);
    numbers3.add(4);
    numbers3.add(3);
    numbers3.add(1);

    //numbers3.sort(Comparator.naturalOrder());
    numbers3.sort(Comparator.reverseOrder());

    System.out.printf("numbers3: %s\n", numbers3);

    System.out.printf(
      "numbers3 contains 6: %b\n",
      numbers3.contains(Integer.valueOf(6))
    );

    System.out.printf("numbers3 is empty: %b\n", numbers3.isEmpty());

    numbers3.forEach(number ->
      numbers3.set(numbers3.indexOf(number), number * 2)
    );

    System.out.printf("New array3: %s\n", numbers3);
  }
}
