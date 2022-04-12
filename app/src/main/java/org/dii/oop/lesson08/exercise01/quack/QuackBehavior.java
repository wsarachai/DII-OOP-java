package org.dii.oop.lesson08.exercise01.quack;

import org.dii.oop.lesson08.exercise01.duck.Duck;

import java.awt.*;

public abstract class QuackBehavior {
    private boolean quacking;

    public abstract void quack(Duck duck, Graphics g);

    public boolean isQuacking() {
        return quacking;
    }

    public void setQuacking(boolean quacking) {
        this.quacking = quacking;
    }
}
