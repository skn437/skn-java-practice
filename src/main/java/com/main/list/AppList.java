package com.main.list;

import com.main.list.utils.Color;
import com.main.list.utils.MethodReference;
import java.util.Arrays;
import java.util.List;

public class AppList {

  public static void main(String[] args) {
    List<String> lists = Arrays.asList(
      "S",
      "h",
      "u",
      "k",
      "h",
      "a",
      "n",
      "Wang So"
    );

    lists.forEach(value -> {
      System.out.printf("Value: %s \n", value);
    });

    //* This type of initialization creates an immutable list
    List<String> anotherList = List.of("SKN", "Wang");

    //anotherList.add("So"); //* This won't work

    // anotherList.forEach(value -> {
    //   System.out.printf("Another List Value: %s \n", value);
    // });

    anotherList.forEach(MethodReference::new);

    String name = "SKN";
    System.out.printf(
      Color.greenBold(
        String.format("Name: %s, This is a green color test! \n", name)
      )
    );
    System.out.printf("Hello %s \n", name);
  }
}
