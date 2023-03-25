package com.company.generic;

import java.util.Map;

public class CupTest {
    public static void main(String[] args) {
        Cup<String> cup = new Cup<>("Coffee");

        Cup<Boolean> booleanCup = new Cup<>(false);

        cup.drink();
        booleanCup.drink();
        cup.divide(4, 0);

        // Conventional Generic letters
        // T - Type
        // K - Key
        // V - Value
        // N - Number
        // E - Element

        /*{
          David: 12,
          Fred: 5,
        }*/
    }
}
