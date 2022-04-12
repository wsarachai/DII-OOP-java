package org.dii.oop.lesson08.exercise01.duck;

import org.dii.oop.lesson08.exercise01.fly.FlyNoWay;
import org.dii.oop.lesson08.exercise01.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super("images/decoy-duck.png");
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
}
