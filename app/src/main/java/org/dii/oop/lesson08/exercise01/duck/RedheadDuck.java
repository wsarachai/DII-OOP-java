package org.dii.oop.lesson08.exercise01.duck;

import org.dii.oop.lesson08.exercise01.fly.FlyWithWings;
import org.dii.oop.lesson08.exercise01.quack.Quck;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super("images/redhead-duck.png");
        quackBehavior = new Quck();
        flyBehavior = new FlyWithWings("images/redhead-duck-fly.png");
    }
}
