package com.model;

import com.behaviors.Fly;
import com.behaviors.flying.NonFlyingDuckBehavior;
import com.behaviors.Quack;
import com.behaviors.quacking.QuackingDuckBehavior;

public abstract class Duck {
    Quack quackingDuckBehavior;
    Fly flyingDuckBehavior;

    public Duck() {
        flyingDuckBehavior = new NonFlyingDuckBehavior();
        quackingDuckBehavior = new QuackingDuckBehavior();
    }
    public void setQuackingDuckBehavior(Quack quackingDuckBehavior) {
        this.quackingDuckBehavior = quackingDuckBehavior;
    }

    public void setFlyingDuckBehavior(Fly flyingDuckBehavior) {
        this.flyingDuckBehavior = flyingDuckBehavior;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public void performFly() {
        flyingDuckBehavior.fly();
    }

    public void performQuack() {
        quackingDuckBehavior.quack();
    }
}
