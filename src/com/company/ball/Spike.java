package com.company.ball;

public class Spike extends Ball {

    // A parent class is one that is extended by the child class
    // The child class INHERITS all the features and properties of the parent
    // class.

    private int numOfSpikes;

    public Spike(boolean isRound, int diameter, int numOfSpikes) {
        super(isRound, diameter); // new Ball(isRound, diameter)
        this.numOfSpikes = numOfSpikes;
    }

    public int getNumOfSpikes() {
        return numOfSpikes;
    }

    public int getNumOfSpikes(int num) {
        return num;
    }


    public void bounce() {
        System.out.println("Spikes don't bounce!");
    }



}
