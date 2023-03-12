package com.company;

import com.company.ball.Ball;
import com.company.ball.Spike;

public class Main {


    // OOP - Object Oriented Programming.
    // A class is a blueprint for creating an object.

    // An instance of a class is the actual construction of your class

    // 'static' ensures that the member it is called on maintains only one
    // instance of itself.

    // An object has:
    // - properties
    // - behaviour

    // A constructor is what allows you to define the acceptable parameters
    // for dynamically creating your objects.

    // 4 core pillars of OOP
    // Encapsulation
    // Inheritance
    // Abstraction
    // Polymorphism

    // Encapsulation is hiding data, being able to control read/write access to
    // an object.

    // Inheritance is creating a hierarchy between objects in your code.
    // When you use inheritance, you're saying that the child(subclass) object
    // is a type of the parent(base class) object.

    // Abstraction is hiding implementation from users of the class.
    // Two main ways for handling abstraction
    // - Abstract classes
    // - Interfaces

    // Polymorphism is making pieces of your code behave differently.
    // These behaviours will be based on how the method is called.
    // There are two main categories of polymorphism:
    // - overloading (Methods, constructors)
    // - overriding (Method)


    public static void main(String[] args) {
//        int result = fNumber + secondNumber;
//        System.out.println(add(4, 6));
//        add(4, 8);



        Ball leatherBall = new Ball(true, 40); // instance
        leatherBall.bounce();

        Ball ball = new Ball(true, 35);
        ball.getDiameter();
        ball.bounce();

        Ball paperBall = new Ball(true, 25);

        Ball americanFootball = new Ball(false, 30);

//        System.out.println("The diameter leather: " + leatherBall.getDiameter());
//        System.out.println("The diameter paper: " + paperBall.getDiameter());
//        System.out.println("The diameter american: " + americanFootball.getDiameter());
//        Ball.keepBallRound();


        Spike spike = new Spike(true, 20, 100);
        System.out.println(spike.getDiameter());
        spike.bounce(); // TODO: spikes don't bounce

        System.out.println(spike.getNumOfSpikes(4));
    }

}
