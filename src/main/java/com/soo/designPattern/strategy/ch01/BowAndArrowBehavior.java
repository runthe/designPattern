package com.soo.designPattern.strategy.ch01;

public class BowAndArrowBehavior implements WeaponBehavior {

  public void attack() {
    System.out.println("화살 발사!");
  }
}
