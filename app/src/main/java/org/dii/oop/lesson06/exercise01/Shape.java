package org.dii.oop.lesson06.exercise01;

public abstract class Shape {
    public static final double PI = 3.14;

    private String name;
    private final int numSide;

    public Shape(String name, int numSide) {
        this.name = name;
        this.numSide = numSide;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        return String.format("Name: %s, Number of side: %d, Area: %.2f, Perimeter: %.2f", name, numSide, getArea(), getPerimeter());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
