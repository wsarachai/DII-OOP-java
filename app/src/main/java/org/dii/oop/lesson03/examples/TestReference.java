package org.dii.oop.lesson03.examples;

public class TestReference {
    // Driver method
    public static void run() {
        // creating box object
        Box b1 = new Box();

        // assigning b2 to b1
        Box b2 = b1;

        // height via b1 and b2
        System.out.println(b1.height);
        System.out.println(b2.height);

        // changing height via b2
        b2.height = 20;

        // height via b1 and b2
        // after modification through b2
        System.out.println(b1.height);
        System.out.println(b2.height);
    }
}
