package org.dii.oop.lesson07.exercise01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinballApp extends JFrame implements ActionListener {
    private final JTextField textField;

    public PinballApp() {
        super("Pinball game");

        BackgroundPanel panel = new BackgroundPanel();
        textField = new JTextField("", 5);
        JButton button = new JButton("OK");
        button.addActionListener(this);

        panel.add(new JLabel("Number of ball: "));
        panel.add(textField);
        panel.add(button);
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

        textField.setText("");
    }
}
