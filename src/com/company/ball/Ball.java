package com.company.ball;

public class Ball {
    // properties = fields
    private boolean isRound;
    private int diameter; //cm

    public Ball(boolean isRound, int diameter) {
        this.isRound = isRound;
        this.diameter = diameter;
    }

    // getters
    public int getDiameter() {
        return diameter;
    }

    // behaviour = methods
    public void bounce() {
        System.out.println("The ball is bouncing");
    }

    public static void keepBallRound() {
        System.out.println("Keeping ball round");
    }
}
