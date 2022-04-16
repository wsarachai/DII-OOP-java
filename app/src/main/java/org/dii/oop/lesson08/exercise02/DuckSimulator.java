package org.dii.oop.lesson08.exercise02;

import org.dii.oop.App;
import org.dii.oop.lesson08.exercise02.duck.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Vector;

public class DuckSimulator extends JPanel implements ActionListener {
    public static int SCREEN_WIDTH = 800;
    public static int SCREEN_HEIGHT = 600;
    public static int SCREEN_SEA_HEIGHT = 350;
    private final Vector<Duck> ducks = new Vector<>();
    private final ImageIcon background;

    public DuckSimulator() {
        URL url = App.class.getResource("images/lake.png");
        assert url != null;
        background = new ImageIcon(url);
        Dimension dimension = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
        setSize(dimension);
        setPreferredSize(dimension);
        setBackground(Color.white);

        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(background.getImage(), 0, 0, null);
        for (Duck duck : ducks) {
            duck.display(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Duck duck : ducks) {
            duck.swim(SCREEN_WIDTH, SCREEN_HEIGHT);
        }
        repaint();
    }
}
