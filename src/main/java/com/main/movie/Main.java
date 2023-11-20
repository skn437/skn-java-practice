package com.main.movie;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Movie movie1 = new Movie(
      "Scarlet Heart - Ryeo",
      "unknown",
      Arrays.asList("Lee Joon Gi", "IU")
    );

    Review review11 = new Review("Extremely Heart Breaking", "SKN", 9.9);
    Review review12 = new Review("I cried a lot!", "THT", 9.9);
    Review review13 = new Review(
      "I don't watch something with sad ending but this one made me change that habit just for once and only for it",
      "PS",
      9.7
    );

    movie1.addReview(review11);
    movie1.addReview(review12);
    movie1.addReview(review13);

    Movie movie2 = new Movie(
      "Demon Slayer",
      "unknown",
      Arrays.asList("Kamado Tanjiro", "Hashibira Inosuke", "Agatsuma Zenitsu")
    );

    Review review21 = new Review("Best Anime Ever", "SKN", 9.5);
    Review review22 = new Review("Action Scenes Are Top Notch", "skn437", 9.6);
    Review review23 = new Review(
      "Nothing can be compared to it. Storyline is just great.",
      "Wang So",
      9.8
    );

    movie2.addReview(review21);
    movie2.addReview(review22);
    movie2.addReview(review23);

    movie1.getDetails();
    movie2.getDetails();
  }
}
