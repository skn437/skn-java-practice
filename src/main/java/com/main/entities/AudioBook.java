package com.main.entities;

public class AudioBook extends Book {

  //* `@Override` annotation is used when inherited class needs to override a method from parent class

  private int runtime;

  public AudioBook(String name, String title, int runtime) {
    super(name, title); //*  This is required when a class extends
    this.runtime = runtime;
  }

  public String getRuntime() {
    if (this.runtime >= 60) {
      int runtimeHour = this.runtime / 60;

      return String.format("%d hour(s)", runtimeHour);
    }

    return String.format("%d minutes(s)", this.runtime);
  }
}
