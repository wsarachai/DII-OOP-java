package org.dii.oop.lesson06.ex02;

// abstract parent class
public abstract class Animal {
    abstract void move();

    abstract void eat();

    // concrete method
    void label() {
        System.out.println("Animal's data:");
    }
}
