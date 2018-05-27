package com.soo.fn.designPattern.observer;

public interface Subject {

  void registerObservers(Observer o);

  void notifyObservers(String tweet);
}
