package org.dii.oop.lesson05.ex04;

// Child class or subclass or derived class
public class Subclass {
    /*
     * The same variable num is declared in the Subclass which is already present in
     * the Superclass
     */
    int num = 110;

    void printNumber() {
        System.out.println(num);
    }

    public static void run() {
        Subclass obj = new Subclass();
        obj.printNumber();
    }
}
