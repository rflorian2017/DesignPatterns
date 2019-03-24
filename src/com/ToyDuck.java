package com;

public class ToyDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void fly() {
        System.out.println("Not flying");
    }
}
