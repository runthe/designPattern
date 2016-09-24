package com.soo.designPattern.adapter;

/**
 * Created by soo on 2016. 9. 24..
 */
public class WildTurkey implements Turkey {

  @Override
  public void gobble() {
    System.out.println("Gobble gobble");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying a short distance");
  }
}
