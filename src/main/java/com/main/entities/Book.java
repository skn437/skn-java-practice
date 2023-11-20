package com.main.entities;

abstract interface BookInterface {
  public String getTitle(); // interface allows only public

  public String getAuthor();

  public String toString();
}

public class Book implements BookInterface {

  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public String toString() {
    return String.format("%s by %s", this.title, this.author);
  }
}
