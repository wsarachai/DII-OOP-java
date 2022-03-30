package org.dii.oop.lesson02.examples;

public class StaticExample08 {
    static int i = 100;
    static String s = "Beginnersbook";

    // Static method
    static void display() {
        System.out.println("i:" + i);
        System.out.println("i:" + s);
    }

    // non-static method
    void funcn() {
        // Static method called in non-static method
        display();
    }

    // static method
    public static void main() {
        StaticExample08 obj = new StaticExample08();
        // You need to have object to call this non-static method
        obj.funcn();

        // Static method called in another static method
        display();
    }
}
