package com.soo.designPattern.decorator;

public class HouseBlend extends CondimentDecorator {

  private Beverage beverage;

  public HouseBlend(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ",하우스블렌디드";
  }

  @Override
  public int cost() {
    return 500 + beverage.cost();
  }
}
