package org.dii.oop.lesson07.exercise01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Vector;

public class BackgroundPanel extends JPanel implements ActionListener {
    private final Vector<Ball> balls = new Vector<>();
    private int speed = 1;

    public BackgroundPanel() {
        Dimension dimension = new Dimension(300, 400);
        setSize(dimension);
        setPreferredSize(dimension);
        setBackground(Color.white);
        setNumOfBall(1);
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Ball ball : balls) {
            ball.paint(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Ball ball : balls) {
            ball.move(getWidth(), getHeight());
        }
        repaint();
    }

    public void setNumOfBall(int numOfBall) {
        balls.clear();
        for (int i=0; i<numOfBall; i++) {
            URL url = getClass().getResource("images/img" + (i%3) + ".png");
            assert url != null;
            Ball ball = new Ball(url, getWidth(), getHeight());
            ball.setSpeed(speed);
            balls.addElement(ball);
        }
    }


    public void setSpeed(int speed) {
        this.speed = speed;
        for (Ball ball : balls) {
            ball.setSpeed(speed);
        }
    }

    public int getSpeed() {
        return speed;
    }
}
