package com;

public class Duck {
    public void quack() {
        System.out.println("Quack quack");
    }

    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
