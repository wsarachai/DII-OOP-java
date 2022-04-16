package org.dii.oop.lesson08.exercise02.duck;

import org.dii.oop.lesson08.exercise02.fly.FlyNoWay;
import org.dii.oop.lesson08.exercise02.quack.Quck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super("images/rubber-duck.png");
        quackBehavior = new Quck();
        flyBehavior = new FlyNoWay();
    }
}
