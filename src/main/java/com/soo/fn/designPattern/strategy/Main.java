package com.soo.fn.designPattern.strategy;

public class Main {

  public static void main(String[] args) {
    Validator validator = new Validator(new IsAllLowerCaseStrategy());
    System.out.println("lower:" + validator.validate("loLer"));

    //람다 표현식에서는 그냥 만들면 된다.

    Validator validator1 = new Validator((s) -> s.matches("[a-z]+"));
    Validator validator2 = new Validator((s) -> s.matches("\\d+]"));
  }
}
