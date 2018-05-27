package com.soo.fn.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {
  final List<Observer> observers = new ArrayList<>();

  @Override
  public void registerObservers(Observer o) {
    this.observers.add(o);
  }

  @Override
  public void notifyObservers(String tweet) {
    this.observers.forEach(o -> o.notify(tweet));
  }
}
