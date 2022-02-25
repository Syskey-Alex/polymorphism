package com.company;

public class Main {

    public static void main(String[] args) {
        //static polymorphism
        FarmAnimal animals1 = new FarmAnimal("daisy");
        FarmAnimal animals2 = new FarmAnimal("Napoleon");

        Cow animal1 = new Cow("Daisy");
        Pig animal2 = new Pig(42);
        System.out.println(animal1.Name + " says " + animal1.noise());
        System.out.println(animal2.Name + " says " + animal2.noise());
    }
}
