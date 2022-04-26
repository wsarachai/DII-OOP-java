package org.dii.oop.lesson06.exercise01;

import java.util.Vector;

public class RunTest {
    public static void run() {
        Vector<Shape> shapes = Test2.createObjects();
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
