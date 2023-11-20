package com.main.trafficlight;

public class Main {

  public static void main(String[] args) {
    TrafficLight light = new TrafficLight("Red", 7);

    System.out.printf("Is Red?: %b\n", light.isRed());
    System.out.printf("Is Green?: %b\n", light.isGreen());
  }
}
