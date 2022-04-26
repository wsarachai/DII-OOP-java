package org.dii.oop.lesson06.exercise01;

public class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        super("RightTriangle", 3);
        this.base = base;
        this.height = height;
    }

    @Override
    public void resize(double ratio) {
        this.base = this.base*ratio;
        this.height = this.height*ratio;
    }

    @Override
    public double calArea() {
        return 0.5*base*height;
    }

    @Override
    public double getPerimeter() {
        double l = Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
        return base+height+l;
    }
}
