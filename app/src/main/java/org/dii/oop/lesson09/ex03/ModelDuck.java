package org.dii.oop.lesson09.ex03;

import org.dii.oop.lesson09.ex03.fly.FlyNoWay;
import org.dii.oop.lesson09.ex03.quack.Quck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quck();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!!");
    }
}
