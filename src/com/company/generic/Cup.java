package com.company.generic;

public class Cup<T> {
    private final T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }


    public T getLiquid() {
        return liquid;
    }

    public void drink() {
        System.out.println("Drinking " + liquid);
    }

    public float divide(float fNumber, float sNumber) {
        if (sNumber == 0) {
            String message = "Cannot divide " + fNumber + " by 0";
            Throwable cause = new ArithmeticException("Division by zero");
            throw new CantDivideByZeroException(message, cause);
        }
        return fNumber / sNumber;
    }
}
