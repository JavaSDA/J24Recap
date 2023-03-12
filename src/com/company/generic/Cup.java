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
}
