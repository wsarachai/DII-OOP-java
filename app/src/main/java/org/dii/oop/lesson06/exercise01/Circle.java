package org.dii.oop.lesson06.exercise01;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(double radius) {
        super("circle", 0);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return PI*radius*2;
    }

    @Override
    public void resize(double ratio) {
        radius = radius * ratio;
    }
}
