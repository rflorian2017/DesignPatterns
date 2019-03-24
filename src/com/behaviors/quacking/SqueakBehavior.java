package com.behaviors.quacking;

import com.behaviors.Quack;

public class SqueakBehavior implements Quack {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
