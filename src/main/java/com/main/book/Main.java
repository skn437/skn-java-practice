package com.main.book;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello SKN!");

    Book dracula = new Book("Dracula", "Bram Stoker", "32");
    Book himu = new Book("Mayurakkhi", "Humayun Ahmed", "36");

    Book.addBook(himu);
    Book.addBook(dracula);

    System.out.printf(
      "Book Collection: %s",
      Book.getBookCollection().toString()
    );
  }
}
