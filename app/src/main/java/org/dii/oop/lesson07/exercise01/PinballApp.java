package org.dii.oop.lesson07.exercise01;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinballApp extends JFrame implements ActionListener, ChangeListener {
    private final BackgroundPanel panel;
    private final JTextField textField;
    private final JLabel labelSpeed;

    public PinballApp() {
        super("Pinball game");

        panel = new BackgroundPanel();
        textField = new JTextField("1", 5);
        JButton button = new JButton("OK");
        button.addActionListener(this);

        JSlider ballSpeed = new JSlider(JSlider.HORIZONTAL, 1, 10, 1);
        ballSpeed.addChangeListener(this);
        labelSpeed = new JLabel("Speed: " + panel.getSpeed());

        panel.add(new JLabel("Number of ball: "));
        panel.add(textField);
        panel.add(button);
        panel.add(ballSpeed);
        panel.add(labelSpeed);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        Timer timer = new Timer(1000/120, panel);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String strNumOfBall = textField.getText();
        System.out.println("Number of ball: " + strNumOfBall);

        panel.setNumOfBall(Integer.parseInt(strNumOfBall));
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            int speed = (int) source.getValue();
            panel.setSpeed(speed);
            labelSpeed.setText("Speed: " + speed);
        }
    }
}
