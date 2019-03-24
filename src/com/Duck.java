package com;

public abstract class Duck {
    QuackingDuckBehavior quackingDuckBehavior;
    FlyingDuckBehavior flyingDuckBehavior;

    public Duck(QuackingDuckBehavior quackingDuckBehavior) {
        this.quackingDuckBehavior = quackingDuckBehavior;
    }

    public Duck() {
        // no fly , no quack
    }

    public Duck(FlyingDuckBehavior flyingDuckBehavior) {
        this.flyingDuckBehavior = flyingDuckBehavior;
    }

    public Duck(FlyingDuckBehavior flyingDuckBehavior, QuackingDuckBehavior quackingDuckBehavior) {
        this.quackingDuckBehavior = quackingDuckBehavior;
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
