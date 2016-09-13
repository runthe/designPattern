package com.soo.designPattern.strategy.ch01;

public class SwordBehavior implements WeaponBehavior {

  public void attack() {
    System.out.println("검질");
  }
}
