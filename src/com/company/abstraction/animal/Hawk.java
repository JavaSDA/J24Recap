package com.company.abstraction.animal;

public class Hawk extends Animal {

    public Hawk(String name, int age) {
        super(name, age, "hawk");
    }

    public void makeSound() {
        System.out.println("Hawk cry!");
    }

}
