package com.soo.fn.designPattern.template;

public class Main {

  public static void main(String[] args) {
    new OnlineBanking().processCustomer((c) -> System.out.println("Hello"));
  }
}
