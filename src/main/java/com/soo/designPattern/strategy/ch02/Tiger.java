package com.soo.designPattern.strategy.ch02;

public class Tiger extends Animal {

  public Tiger() {
    cry = new TigerCry();
    fly = new FlyNoWay();
  }

  public void display() {
    System.out.println("호랑이");
  }
}
