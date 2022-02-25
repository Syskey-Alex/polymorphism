package com.company;

public class Pig extends FarmAnimal {
  public String Name = "Napoleon";

  //dynamic
  public Pig(int serialCode) {
    super(serialCode);
  }

  @Override
  public String noise() {
    return "oink";
  }
}
