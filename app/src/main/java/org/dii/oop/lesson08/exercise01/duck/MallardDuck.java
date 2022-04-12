package org.dii.oop.lesson08.exercise01.duck;

import org.dii.oop.lesson08.exercise01.fly.FlyWithWings;
import org.dii.oop.lesson08.exercise01.quack.Quck;
import org.dii.oop.lesson08.exercise01.quack.Squeak;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super("images/mallord-duck.png");
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings("images/mallord-duck-fly.png");
    }
}
