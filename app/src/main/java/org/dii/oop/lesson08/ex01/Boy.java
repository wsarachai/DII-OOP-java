package org.dii.oop.lesson08.ex01;

public class Boy extends Human {
    // Overriding method
    public void eat() {
        System.out.println("Boy is eating");
    }

    public static void run() {
        Boy obj = new Boy();
        // This will call the child class version of eat()
        obj.eat();
    }
}
