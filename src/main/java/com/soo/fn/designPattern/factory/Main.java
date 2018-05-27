package com.soo.fn.designPattern.factory;

import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    Supplier<Product> loanSupplier = Loan::new;
  }
}

interface Product {
}

class Loan implements Product {
}


