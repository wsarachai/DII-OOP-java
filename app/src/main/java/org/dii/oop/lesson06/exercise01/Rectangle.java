package org.dii.oop.lesson06.exercise01;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name, 4);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this("Rectangle", width, height);
    }

    @Override
    public void resize(double ratio) {
        this.width = this.width*ratio;
        this.height = this.height*ratio;
    }

    @Override
    public double calArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*height;
    }
}
