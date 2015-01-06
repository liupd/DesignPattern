
package com.design.pattern.strategy;

public class RedHeadDuck extends Duck {
    
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swinBehavior = new SwinWithWebbedFeet();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
