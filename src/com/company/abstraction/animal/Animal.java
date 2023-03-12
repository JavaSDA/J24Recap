package com.company.abstraction.animal;

public abstract class Animal {
    // An abstract class is a blueprint for defining aspects foa an object
    // that you want to be inherited by other similar objects.

    // An abstract class is also the only type of class that
    // can hold abstract methods.

    // Abstract methods are methods that do not have a body and also have
    // the abstract keyword in their definition.

    private String name;
    private int age;
    private String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public abstract void makeSound();
}
