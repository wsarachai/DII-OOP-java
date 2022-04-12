package org.dii.oop.lesson08.exercise01.fly;

import org.dii.oop.App;
import org.dii.oop.lesson08.exercise01.duck.Duck;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class FlyWithWings extends FlyBehavior {
    private final ImageIcon image;

    public FlyWithWings(String resource) {
        URL url = App.class.getResource(resource);
        assert url != null;
        this.image = new ImageIcon(url);
    }

    @Override
    public void fly(Duck duck, Graphics g) {
        g.drawImage(image.getImage(), duck.getX(), duck.getY(), null);
    }
}
