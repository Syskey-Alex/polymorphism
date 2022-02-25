package com.company;

public class Cow extends FarmAnimal {
    public String Name = "Mollie";

    public Cow(String serialCode) {
        super(serialCode);
    }


    @Override
    public String noise() {
        return "moo!";
    }
}
