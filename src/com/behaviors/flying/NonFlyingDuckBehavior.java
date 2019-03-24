package com.behaviors.flying;

import com.behaviors.Fly;

public class NonFlyingDuckBehavior implements Fly {

    public void fly() {
        System.out.println("I am not flying");
    }
}

