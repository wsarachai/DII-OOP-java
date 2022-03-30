package org.dii.oop.lesson02.examples;

/************************
 * Java program to demonstrate the use of static blocks
 */
public class StaticExample01 {
    // static variable
    static int j = 10;
    static int n;

    // static block
    static {
        System.out.println("Static block initialized.");
        n = j * 8;
    }

    public static void main() {
        System.out.println("Inside main method");
        System.out.println("Value of j : " + j);
        System.out.println("Value of n : " + n);
    }
}
