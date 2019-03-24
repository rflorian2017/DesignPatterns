package com;

public class ToyDuck extends Duck implements Quack {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
