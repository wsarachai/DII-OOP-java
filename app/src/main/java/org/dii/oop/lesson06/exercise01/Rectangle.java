package org.dii.oop.lesson06.exercise01;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double high;

    public Rectangle(String name, double width, double high) {
        super(name, 4);
        this.width = width;
        this.high = high;
    }

    public Rectangle(double width, double high) {
        this("rectangle", width, high);
    }

    @Override
    public void resize(double ratio) {
        width = width * ratio;
        high = high * ratio;
    }

    @Override
    public double getArea() {
        return width * high;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
