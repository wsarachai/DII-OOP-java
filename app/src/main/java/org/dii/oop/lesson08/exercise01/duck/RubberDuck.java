package org.dii.oop.lesson08.exercise01.duck;

import org.dii.oop.lesson08.exercise01.fly.FlyNoWay;
import org.dii.oop.lesson08.exercise01.quack.Quck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super("images/rubber-duck.png");
        quackBehavior = new Quck();
        flyBehavior = new FlyNoWay();
    }
}
