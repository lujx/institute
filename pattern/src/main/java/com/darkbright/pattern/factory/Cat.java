package com.darkbright.pattern.factory;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-02-15 16:23
 **/
public class Cat implements Animal{
  @Override
  public void crow() {
    System.out.println("Cat: Meow!");
  }
}
