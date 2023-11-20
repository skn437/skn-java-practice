package com.main.musiclibrary;

abstract interface SongInterface {
  public String getTitle();

  public void setTitle(String title);

  public String getAuthor();

  public void setAuthor(String author);
}

public class Song implements SongInterface {

  private String title;
  private String author;

  public Song(String title, String author) {
    this.title = title;
    this.author = author;
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

  public String toString() {
    return String.format("%s by %s\n", this.title, this.author);
  }
}
