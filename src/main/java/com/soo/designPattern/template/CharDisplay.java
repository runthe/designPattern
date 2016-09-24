package com.soo.designPattern.template;

/**
 * Created by soo on 2016. 9. 24..
 */
public class CharDisplay extends AbstractDisplay {

  private char ch;

  public CharDisplay(char ch) {
    this.ch = ch;
  }

  @Override
  public void open() {
    System.out.println("<<");
  }

  @Override
  public void print() {
    System.out.println(ch);
  }

  @Override
  public void close() {
    System.out.println(">>");
  }
}
