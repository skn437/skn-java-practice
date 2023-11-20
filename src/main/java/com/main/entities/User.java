package com.main.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

abstract interface UserInterface {
  public String getName();

  public String getBirthday();

  public int getAge();

  public void borrowBook(Book book);

  public String getBorrowedBooks();
}

public class User implements UserInterface {

  //* Constructor must have the same name as the class
  //* Constructor must not have a return type
  //* Constructor must not return anything or it must return void
  //* If no constructor is given, then Java will create a default one. This way is not recommended.

  private String name;
  private LocalDate birthday;

  public User(String name, String birthday) {
    this.name = name;
    this.birthday = LocalDate.parse(birthday);
  }

  private List<Book> books = new ArrayList<Book>();

  public String getName() {
    return this.name;
  }

  public String getBirthday() {
    return this.birthday.toString();
  }

  public int getAge() {
    Period age = Period.between(this.birthday, LocalDate.now());

    return age.getYears();
  }

  public void borrowBook(Book book) {
    this.books.add(book);
  }

  public String getBorrowedBooks() {
    return this.books.toString();
  }
}
