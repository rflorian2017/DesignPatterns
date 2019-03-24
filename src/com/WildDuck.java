package com;

public class WildDuck extends Duck implements Fly, Quack {
    public void fly() {
        System.out.println("I am flying");
    }

    public void quack() {
        System.out.println("Quack quack");
    }
}
