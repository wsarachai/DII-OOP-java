package org.dii.oop.lesson02.examples;

public class StaticExample04 {
    static int var1;
    static String var2;

    // This is a Static Method
    static void disp() {
        System.out.println("Var1 is: " + var1);
        System.out.println("Var2 is: " + var2);
    }

    public static void main() {
        disp();
    }
}