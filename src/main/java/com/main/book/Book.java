package com.main.book;

import java.util.ArrayList;
import java.util.List;

abstract interface BookInterface {
  public String getTitle();

  public void setTitle(String title);

  public String getAuthor();

  public void setAuthor(String author);

  public String getISBN();

  public void setISBN(String ISBN);
}

public class Book implements BookInterface {

  private String title;
  private String author;
  private String ISBN;

  public Book(String title, String author, String ISBN) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getISBN() {
    return this.ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String toString() {
    return String.format("%s by %s", this.title, this.author);
  }

  private static List<Book> bookCollection = new ArrayList<Book>();

  public static List<Book> getBookCollection() {
    return bookCollection;
  }

  public static void addBook(Book book) {
    bookCollection.add(book);
  }

  public static void removeBook(Book book) {
    bookCollection.remove(book);
  }
}
