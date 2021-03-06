package com.soo.designPattern.template;

public abstract class AbstractDisplay {

  public abstract void open();

  public abstract void print();

  public abstract void close();

  public final void display() {
    open();

    for (int i = 0; i < 5; i++) {
      print();
    }

    close();
  }

  //기본적으로 아무것도 하지않는 Hook메소드˜
  public boolean hook() {
    return hook();
  }
}
