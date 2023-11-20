package com.main.movie;

abstract interface ReviewInterface {
  public String getReview();

  public String getReviewer();

  public double getRating();
}

public class Review implements ReviewInterface {

  private String review;
  private String reviewer;
  private double rating;

  public Review(String review, String reviewer, double rating) {
    this.review = review;
    this.reviewer = reviewer;
    this.rating = rating;
  }

  public String getReview() {
    return this.review;
  }

  public String getReviewer() {
    return this.reviewer;
  }

  public double getRating() {
    return this.rating;
  }
}
