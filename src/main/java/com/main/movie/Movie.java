package com.main.movie;

import java.util.ArrayList;
import java.util.List;

abstract interface MovieInterface {
  public String getTitle();

  public String getDirector();

  public List<String> getActors();

  public List<Review> getReviews();

  public void addReview(Review review);

  public void removeReview(Review review);

  public void getDetails();
}

public class Movie implements MovieInterface {

  private String title;
  private String director;
  private List<String> actors;
  private List<Review> reviews;

  public Movie(String title, String director, List<String> actors) {
    this.title = title;
    this.director = director;
    this.actors = actors;
    this.reviews = new ArrayList<Review>();
  }

  public String getTitle() {
    return this.title;
  }

  public String getDirector() {
    return this.director;
  }

  public List<String> getActors() {
    return this.actors;
  }

  public List<Review> getReviews() {
    return this.reviews;
  }

  public void addReview(Review review) {
    this.reviews.add(review);
  }

  public void removeReview(Review review) {
    this.reviews.remove(review);
  }

  public void getDetails() {
    System.out.printf("\nReviews for Movie: %s\n", this.title);

    for (Review review : reviews) {
      System.out.printf(
        "%s by: %s - %.1f\n",
        review.getReview(),
        review.getReviewer(),
        review.getRating()
      );
    }
  }
}
