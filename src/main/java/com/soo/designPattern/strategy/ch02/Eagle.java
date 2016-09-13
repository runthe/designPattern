package com.soo.designPattern.strategy.ch02;

public class Eagle extends Animal {

  public Eagle() {
    cry = new BirdCry();
    fly = new FlyWithWings();
  }

  public void display() {
    System.out.println("독수리");
  }
}
