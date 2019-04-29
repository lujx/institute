package com.darkbright.pattern.factory;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-02-15 16:20
 **/
public class Dog implements Animal {
  @Override
  public void crow() {
    System.out.println("Dog: Woof!");
  }
}
