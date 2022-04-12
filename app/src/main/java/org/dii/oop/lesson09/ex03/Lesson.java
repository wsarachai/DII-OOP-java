package org.dii.oop.lesson09.ex03;

import org.dii.oop.lesson09.ex03.fly.FlyRocketPowered;

public class Lesson {
    public static void run() {
        System.out.println("Mini duck simulator");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}