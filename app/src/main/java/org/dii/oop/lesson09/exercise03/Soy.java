package org.dii.oop.lesson09.exercise03;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 0.15 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
