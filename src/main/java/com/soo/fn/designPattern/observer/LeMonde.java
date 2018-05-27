package com.soo.fn.designPattern.observer;

public class LeMonde implements Observer {
  @Override
  public void notify(String tweet) {
    if (tweet != null & tweet.contains("lemon")) {
      System.out.println("Today lemon!");
    }
  }
}
