package org.dii.oop.lesson09.ex03;

import org.dii.oop.lesson09.ex03.fly.FlyWithWings;
import org.dii.oop.lesson09.ex03.quack.Quck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quck();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
