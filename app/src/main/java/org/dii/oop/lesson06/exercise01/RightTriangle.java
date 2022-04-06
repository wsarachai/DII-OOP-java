package org.dii.oop.lesson06.exercise01;

public class RightTriangle extends Shape implements Resizeable {
    private double base;
    private double high;

    public RightTriangle(double base, double high) {
        super("right triangle", 3);
        this.base = base;
        this.high = high;
    }

    @Override
    public void resize(double ratio) {
        base = base * ratio;
        high = high * ratio;
    }

    @Override
    public double getArea() {
        return 0.5*base*high;
    }

    @Override
    public double getPerimeter() {
        double c = Math.sqrt(Math.pow(base, 2)+Math.pow(high, 2));
        return base+high+c;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
