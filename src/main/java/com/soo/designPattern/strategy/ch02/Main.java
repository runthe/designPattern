package com.soo.designPattern.strategy.ch02;

public class Main {

  public static void main(String[] args) {
    Animal tiger = new Tiger();
    tiger.display();
    tiger.performCry();
    tiger.performFly();

    System.out.println("-------");

    Animal eagle = new Eagle();
    eagle.display();
    eagle.performCry();
    eagle.performFly();
  }

}
