package org.dii.oop.lesson09.exercise02.duck;

import org.dii.oop.lesson09.exercise02.fly.FlyWithWings;
import org.dii.oop.lesson09.exercise02.quack.Quck;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super("images/redhead-duck.png");
        quackBehavior = new Quck();
        flyBehavior = new FlyWithWings("images/redhead-duck-fly.png");
    }
}
