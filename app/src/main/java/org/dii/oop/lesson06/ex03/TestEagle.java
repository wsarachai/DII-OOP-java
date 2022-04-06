package org.dii.oop.lesson06.ex03;

public class TestEagle {
    public static void run() {
        Eagle myEagle = new Eagle();

        myEagle.eat();
        myEagle.sound();
        myEagle.fly();

        System.out.println("Number of legs: " + Bird.numberOfLegs);
        System.out.println("Outer covering: " + Bird.outerCovering);
    }
}
