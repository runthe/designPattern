package com.soo.designPattern.adapter;

/**
 * Created by soo on 2016. 9. 24..
 */
public class MallardDuck implements Duck {

  @Override
  public void quack() {
    System.out.println("Quack");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying");
  }
}
