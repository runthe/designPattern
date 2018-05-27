package com.soo.fn.designPattern.strategy;


public class IsAllLowerCaseStrategy implements ValidationStrategy {
  @Override
  public boolean execute(String s) {
    return s.matches("[a-z]+");
  }
}