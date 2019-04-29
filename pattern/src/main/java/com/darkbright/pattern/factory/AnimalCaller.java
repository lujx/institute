package com.darkbright.pattern.factory;

import java.util.Scanner;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-02-15 16:36
 **/
public class AnimalCaller {
  private final static String CAT = "cat";
  private final static String DOG = "dog";


  public static void main(String[] args) {
    System.out.println("Choose an animal type: 1.cat 2.dog");

    AnimalFactory animalFactory = new AnimalFactory();
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String choice;

      switch (in.next()) {
        case "1":
          choice = CAT;
          break;
        case "2":
          choice = DOG;
          break;
        default:
          choice = null;
      }
      Animal animal = animalFactory.CallAnimal(choice);
      animal.crow();
    }
  }

}
