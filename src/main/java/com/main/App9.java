package com.main;

import com.main.entities.AudioBook;
import com.main.entities.Book;
import com.main.entities.User;

public class App9 {

  public static void main(String[] args) {
    //* OOP Practice
    User user = new User("SKN", "1993-08-06");

    System.out.printf("Name is: %s\n", user.getName());
    System.out.printf("Birthday is: %s\n", user.getBirthday());
    System.out.printf("Age is: %d\n", user.getAge());

    Book book = new Book("Mayurakshi", "Humayun Ahmed");

    System.out.printf("Book Title: %s\n", book.getTitle());
    System.out.printf("Book Author: %s\n", book.getAuthor());

    user.borrowBook(new Book("Dorjar Opashe", "Humayun Ahmed"));

    System.out.printf("Borrowed Books: %s\n", user.getBorrowedBooks());

    AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 300);

    System.out.printf("Dracula Author: %s\n", dracula.getAuthor());
    System.out.printf("Dracula Runtime: %s\n", dracula.getRuntime());
  }
}
