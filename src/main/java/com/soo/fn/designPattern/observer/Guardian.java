package com.soo.fn.designPattern.observer;

public class Guardian implements Observer {
  @Override
  public void notify(String tweet) {
    if (tweet != null & tweet.contains("wine")) {
      System.out.println("Today wine!");
    }
  }
}
