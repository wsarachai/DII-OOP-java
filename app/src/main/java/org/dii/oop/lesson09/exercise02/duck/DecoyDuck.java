package org.dii.oop.lesson09.exercise02.duck;

import org.dii.oop.lesson09.exercise02.fly.FlyNoWay;
import org.dii.oop.lesson09.exercise02.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super("images/decoy-duck.png");
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
}
