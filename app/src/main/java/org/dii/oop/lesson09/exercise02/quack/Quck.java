package org.dii.oop.lesson09.exercise02.quack;

import org.dii.oop.App;
import org.dii.oop.lesson09.exercise02.duck.Duck;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Quck extends QuackBehavior {
    private final ImageIcon image;

    public Quck() {
        URL url = App.class.getResource("images/quack.png");
        assert url != null;
        this.image = new ImageIcon(url);
    }

    @Override
    public void quack(Duck duck, Graphics g) {
        g.drawImage(image.getImage(),
                duck.getX()+image.getIconWidth()/2,
                duck.getY()-image.getIconHeight(),
                null);
    }
}
