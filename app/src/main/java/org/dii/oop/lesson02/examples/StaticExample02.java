package org.dii.oop.lesson02.examples;

public class StaticExample02 {
    static int num;
    static String mystr;

    static {
        num = 97;
        mystr = "Static keyword in Java";
    }

    public static void main() {
        System.out.println("Value of num: " + num);
        System.out.println("Value of mystr: " + mystr);
    }
}
