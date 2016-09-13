package com.soo.designPattern.strategy.ch01;

public class AxeBehavior implements WeaponBehavior {

  public void attack() {
    System.out.println("도기질");
  }
}
