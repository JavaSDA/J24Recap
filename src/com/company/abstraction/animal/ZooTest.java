package com.company.abstraction.animal;

public class ZooTest {
    public static void main(String[] args) {
//        String[] words = new String[4]; // empty

//        System.out.println(Arrays.toString(words));

        Zoo germanZoo = new Zoo(4);

        // Abstraction between type of Animal and the actual animal
        Animal bingo = new Dog("Bingo", 3);
        Animal harry = new Hawk("Harry", 5);

        germanZoo.addAnimal(bingo);
        germanZoo.addAnimal(harry);

//        System.out.println(Arrays.toString(germanZoo.getAnimals()));
        germanZoo.printAnimals();
//        System.out.println();
    }
}
