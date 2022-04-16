package org.dii.oop.lesson08.exercise02.duck;

import org.dii.oop.lesson08.exercise02.fly.FlyWithWings;
import org.dii.oop.lesson08.exercise02.quack.Squeak;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super("images/mallord-duck.png");
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings("images/mallord-duck-fly.png");
    }
}
