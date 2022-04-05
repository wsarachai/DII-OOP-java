package org.dii.oop.lesson05.ex06;

public class ChildClass extends Parentclass {
    ChildClass() {
        /*
         * super() must be added to the first statement of constructor otherwise you
         * will get a compilation error. Another important point to note is that when we
         * explicitly use super in constructor the compiler doesn't invoke the parent
         * constructor automatically.
         */
        super("Hahaha");
        System.out.println("Constructor of child class");

    }

    void display() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        ChildClass obj = new ChildClass();
        obj.display();
    }
}
