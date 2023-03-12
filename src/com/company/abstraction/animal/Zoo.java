package com.company.abstraction.animal;

public class Zoo {
    private Animal[] animals;
    private int numOfAnimals;

    public Zoo(int maxSize) {
        animals = new Animal[maxSize];
        numOfAnimals = 0;
    }


    public Animal[] getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        if (numOfAnimals < animals.length) {
            animals[numOfAnimals] = animal;
            numOfAnimals++; // increment the counter by 1
        } else {
            System.out.println("Zoo is full!");
        }
    }

    public void printAnimals() {
        System.out.println("Animals in the zoo include: ");

        for (int i = 0; i < numOfAnimals; i++) {
            Animal animal = animals[i]; // the current animal in the iteration
            System.out.println(
                    animal.getType() + " - "
                    + animal.getName()
                    + " (" + animal.getAge()
                    + " years old)");
        }
    }

}
