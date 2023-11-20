package com.main.trafficlight;

abstract interface TrafficLightInterface {
  public String getColor();

  public int getDuration();

  public void changeColor(String newColor);

  public boolean isGreen();

  public boolean isRed();
}

public class TrafficLight implements TrafficLightInterface {

  private String color;
  private int duration;

  public TrafficLight(String color, int duration) {
    this.color = color;
    this.duration = duration;
  }

  public String getColor() {
    return this.color;
  }

  public int getDuration() {
    return this.duration;
  }

  public boolean isGreen() {
    return this.color.equals("Green");
  }

  public boolean isRed() {
    return this.color.equals("Red");
  }

  public void changeColor(String newColor) {
    this.color = newColor;
  }
}
