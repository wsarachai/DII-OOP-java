package org.dii.oop.lesson09.exercise02;

/*
 * The beverage is an abstract class with
 * two methods getDescription() and cost()
 */
public abstract class Beverage {
    String description ="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    // getDescription is already implemented for us,
    // but we need to implement cost() in the subclasses
    public abstract double getCost();
}
