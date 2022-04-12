package org.dii.oop.lesson09.ex03.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
