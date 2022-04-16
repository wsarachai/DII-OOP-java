package org.dii.oop.lesson09.exercise02.fly;

import org.dii.oop.lesson09.exercise02.duck.Duck;

import java.awt.*;

public abstract class FlyBehavior {
    private boolean flying;

    public abstract void fly(Duck duck, Graphics g);

    public boolean isFlying() {
        return flying;
    }
    public void setFlying(boolean flying) {
        this.flying = flying;
    }
}
