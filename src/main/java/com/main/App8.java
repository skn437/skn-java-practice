package com.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App8 {

  public static void main(String[] args) {
    //* ArrayList Practice Again As It's going To Be Most Useful
    List<Integer> numbers = new ArrayList<Integer>();

    numbers.add(36);
    numbers.add(40);
    numbers.add(69);

    System.out.printf("numbers: %s\n", numbers);

    System.out.printf("3rd element of numbers: %d\n", numbers.get(2)); // get by index

    numbers.remove(0);
    System.out.printf("New numbers after removal: %s\n", numbers);

    numbers.forEach(number -> numbers.set(numbers.indexOf(number), number * 10)
    );

    System.out.printf("10 folded numbers: %s\n", numbers);

    boolean check = numbers.contains(Integer.valueOf(690));

    System.out.printf("690 is in the array list: %b\n", check);

    numbers.add(7);

    System.out.printf("Unsorted numbers: %s\n", numbers);

    numbers.sort(Comparator.naturalOrder());

    System.out.printf("Sorted numbers: %s\n", numbers);

    System.out.printf("Size of numbers ArrayList: %d\n", numbers.size());

    System.out.printf("numbers ArrayList is empty: %b\n", numbers.isEmpty());
  }
}
