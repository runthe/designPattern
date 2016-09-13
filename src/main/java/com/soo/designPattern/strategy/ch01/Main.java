package com.soo.designPattern.strategy.ch01;

import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Character character1 = new Character(new SwordBehavior());
    character1.fight();

    Character character2 = new Character(new AxeBehavior());
    character2.fight();

    character2.setWeapon(new BowAndArrowBehavior());
    character2.fight();
  }
}
