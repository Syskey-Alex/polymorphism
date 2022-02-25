package com.company;

public class FarmAnimal {
    protected String Name;
    protected int serialCode; //positive value

    //static polymorphism
    public FarmAnimal(String Name) {
        this.Name = Name;
        serialCode = -1; //deliberately invalid
    }

    public FarmAnimal(int number) {
        serialCode = number;
        Name = "project101"; //random name to just test
    }

    public void display() {
        System.out.println(serialCode == 0 ? serialCode : Name);
    }

    public String noise() {
        return "a vague snuffling noise";
    }

}
