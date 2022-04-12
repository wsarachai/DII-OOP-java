package org.dii.oop.lesson08.ex02;

public class JavaExample extends ParentClass {
    JavaExample() {
        System.out.println("Constructor of Child");
    }

    void display() {
        System.out.println("Child Method");
        // Calling the disp() method of parent class
        super.display();
    }

    public static void run() {
        // Creating the object of child class
        JavaExample obj = new JavaExample();
        obj.display();
    }
}
