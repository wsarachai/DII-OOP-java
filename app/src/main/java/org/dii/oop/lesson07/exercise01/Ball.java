package org.dii.oop.lesson07.exercise01;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Ball {
    private static int id = 0;
    private final ImageIcon imageIcon;
    private int x;
    private int y;
    private int speed = 1;
    private int dx = 1;
    private int dy = 1;

    public Ball(URL url, int width, int height) {
        imageIcon = new ImageIcon(url);
        x = (imageIcon.getIconWidth() * id) % (width-imageIcon.getIconWidth());
        y = (imageIcon.getIconHeight() * id++) % (height- imageIcon.getIconHeight());
    }

    public void paint(Graphics g) {
        g.drawImage(imageIcon.getImage(), x, y, null);
    }

    public void move(int width, int height) {
        x+=(speed*dx);
        if (x<=0 || x>=width-imageIcon.getIconWidth()) {
            dx = -dx;
        }
        y+=(speed*dy);
        if (y<=0 || y>=height-imageIcon.getIconHeight()) {
            dy = -dy;
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
