package org.dii.oop.lesson08.exercise02.duck;

import org.dii.oop.App;
import org.dii.oop.lesson08.exercise02.DuckSimulator;
import org.dii.oop.lesson08.exercise02.fly.FlyBehavior;
import org.dii.oop.lesson08.exercise02.quack.QuackBehavior;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Random;

public abstract class Duck {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private final int speed;
    private final ImageIcon image;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck(String resourceUrl) {
        URL url = App.class.getResource(resourceUrl);
        assert url != null;
        this.image = new ImageIcon(url);

        Random random = new Random();
        speed = random.nextInt(1, 3);
        dx = random.nextInt(1, 2);
        dy = random.nextInt(1, 2);
        x = random.nextInt(1, 200);
        y = random.nextInt(550, 555);
    }

    public void display(Graphics g) {
        if (performFly(g)) {
            g.drawImage(image.getImage(), x, y, null);
        }
        performQuack(g);
    }

    public boolean performFly(Graphics g) {
        if (flyBehavior.isFlying()) {
            flyBehavior.fly(this, g);
            return false;
        }
        return true;
    }

    public void performQuack(Graphics g) {
        if (quackBehavior.isQuacking()) {
            quackBehavior.quack(this, g);
        }
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim(int width, int height) {
        x+=(speed*dx);
        if (x<=0 || x>=width-image.getIconWidth()) {
            dx = -dx;
            quackBehavior.setQuacking(!quackBehavior.isQuacking());
        }
        y+=(speed*dy);

        int minHeight = 0;
        if (!flyBehavior.isFlying()) {
            minHeight = DuckSimulator.SCREEN_SEA_HEIGHT;
        }

        if (y<=minHeight) {
            dy = -dy;
        }
        if (y>=height - image.getIconHeight()) {
            dy = -dy;
            flyBehavior.setFlying(!flyBehavior.isFlying());
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
