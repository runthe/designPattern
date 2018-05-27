package com.soo.fn.designPattern.template;

import java.util.function.Consumer;

public class OnlineBankingLambda {
  public void processCustomer(Consumer<Customer> makeCustomerHappy) {
    System.out.println("TemplateMethod");

    Customer c = new Customer();
    makeCustomerHappy.accept(c);
  }
}
