package com.soo.designPattern.decorator;

public class Mocha extends Beverage {

  public Mocha() {
    this.description = "모카";
  }

  @Override
  public int cost() {
    return 2000;
  }
}
