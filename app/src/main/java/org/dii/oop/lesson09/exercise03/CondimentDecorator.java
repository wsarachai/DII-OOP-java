package org.dii.oop.lesson09.exercise03;

/*
 * First, we need to be interchangeable with a Beverage,
 * so we extend the Beverage class.
 */
public abstract class CondimentDecorator extends Beverage {
    // We're also going to require that the condiment
    // decorators all reimplement the getDescription() method.
    public abstract String getDescription();
}
