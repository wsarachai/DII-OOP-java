package org.dii.oop.lesson08.ex02;

public class Subclass extends ParentClass {
    // Overriding method
    void display() {
        System.out.println("Child class method");
    }

    void printMsg() {
        // This would call Overriding method
        display();
        // This would call Overridden method
        super.display();
    }

    public static void run() {
        Subclass obj = new Subclass();
        obj.printMsg();
    }
}
