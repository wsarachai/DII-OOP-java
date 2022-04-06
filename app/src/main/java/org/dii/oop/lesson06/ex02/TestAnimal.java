package org.dii.oop.lesson06.ex02;

public class TestAnimal {
    public static void run() {
        Animal myBird = new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();

        Animal myFish = new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();
    }
}
