package org.dii.oop.lesson06.exercise01;

import java.util.Vector;

public class Test2 {
    public static Vector<Shape> createObjects() {
        Vector<Shape> shapes = new Vector<>();
        shapes.addElement(new Circle(1));
        shapes.addElement(new RightTriangle(2, 3));
        shapes.addElement(new Rectangle(4, 5));
        return shapes;
    }
}
