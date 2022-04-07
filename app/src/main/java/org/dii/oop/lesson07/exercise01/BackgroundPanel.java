package org.dii.oop.lesson07.exercise01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class BackgroundPanel extends JPanel implements ActionListener {
    ImageIcon icon;
    private int x;
    private int speedX = 1;
    private int y;
    private int speedY = 1;

    public BackgroundPanel() {
        setPreferredSize(new Dimension(300, 400));
        setBackground(Color.white);
        URL url = getClass().getResource("images/img1.png");

        assert url != null;
        icon = new ImageIcon(url);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(icon.getImage(), x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x+=speedX;
        if (x<=0 || x>=getWidth()-icon.getIconWidth()) {
            speedX = -speedX;
        }
        y+=speedY;
        if (y<=0 || y>=getHeight()-icon.getIconHeight()) {
            speedY = -speedY;
        }
        repaint();
    }
}
