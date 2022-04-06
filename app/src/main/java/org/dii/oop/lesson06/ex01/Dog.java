package org.dii.oop.lesson06.ex01;

// Dog class extends Animal class
public class Dog extends Animal {
    public void sound() {
        System.out.println("Woof");
    }

    public static void run() {
        Animal obj = new Dog();
        obj.sound();
    }
}
