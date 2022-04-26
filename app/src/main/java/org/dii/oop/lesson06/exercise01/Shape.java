package org.dii.oop.lesson06.exercise01;

public abstract class Shape implements Resizeable {
    public static final double PI = 3.14;

    private String name;
    private int numSide;

    public Shape(String name, int numSide) {
        this.name = name;
        this.numSide = numSide;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Number of side: %d, Area: %.2f, Perimeter: %.2f",
                name, numSide, calArea(), getPerimeter());
    }

    public abstract double calArea();
    public abstract double getPerimeter();
}
