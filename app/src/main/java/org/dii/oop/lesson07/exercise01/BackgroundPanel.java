package org.dii.oop.lesson07.exercise01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class BackgroundPanel extends JPanel implements ActionListener {
    private final ImageIcon imageIcon;
    private int x;          // the horizontal position of the ball
    private int y;          // the vertical position of the ball
    private int dx = 1;     // control the direction of the ball on a horizontal axis
    private int dy = 1;     // control the direction of the ball on a vertical axis
    private int speed = 1;  // control the speed of the ball

    public BackgroundPanel() {
        Dimension dimension = new Dimension(300, 400);
        setSize(dimension);
        setPreferredSize(dimension);
        setBackground(Color.white);

        // ball init
        URL url = getClass().getResource("images/img0.png"); // "images/img0.png", "images/img1.png", or "images/img2.png"
        assert url != null;
        imageIcon = new ImageIcon(url);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // paint the ball image according to the x and y position
        g.drawImage(imageIcon.getImage(), x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        TODO: uncomment this to make the ball move.
//        x+=(speed*dx);
//        if (x<=0 || x>=getWidth()-imageIcon.getIconWidth()) {
//            dx = -dx;
//        }
//        y+=(speed*dy);
//        if (y<=0 || y>=getHeight()-imageIcon.getIconHeight()) {
//            dy = -dy;
//        }

        // repaint the ball image,
        // the method actionPerformed(ActionEvent e) will be called.
        repaint();
    }

    // The encapsulation set method, make the speed attribute be writable
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // The encapsulation get method, make the speed attribute be readable
    public int getSpeed() {
        return speed;
    }
}
