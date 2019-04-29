package com.darkbright.pattern.factory;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-02-15 16:29
 **/
public class AnimalFactory {
  public Animal CallAnimal(String AnimalType) {
    if (AnimalType == null) {
      return null;
    }
    if (AnimalType.equalsIgnoreCase("DOG")) {
      return new Dog();
    } else if (AnimalType.equalsIgnoreCase("CAT")) {
      return new Cat();
    }
    return null;
  }
}
