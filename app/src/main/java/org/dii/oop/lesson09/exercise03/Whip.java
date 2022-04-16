package org.dii.oop.lesson09.exercise03;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 0.10 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}
