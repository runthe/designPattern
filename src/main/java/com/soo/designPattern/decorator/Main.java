package com.soo.designPattern.decorator;

public class Main {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + "cost : " + beverage.cost());

    Beverage beverage1 = new Mocha();
    beverage1 = new HouseBlend(beverage1);
    beverage1 = new HouseBlend(beverage1);

    System.out.println(beverage1.getDescription() + "cost : " + beverage1.cost());
  }
}
