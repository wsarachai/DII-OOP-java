package org.dii.oop.lesson07.exercise01;

import javax.swing.*;

public class PinballApp extends JFrame {
    protected final int FPS = 1000/120;
    private final BackgroundPanel panel;
    private final JTextField textField;
    private final JLabel labelSpeed;

    public PinballApp() {
        super("Pinball game");

        panel = new BackgroundPanel();
        textField = new JTextField("1", 5);
        JButton button = new JButton("OK");

        JSlider ballSpeed = new JSlider(JSlider.HORIZONTAL, 1, 10, 1);
        // TODO: remove this comment and fixed the error,
        //       this needs an understanding of the Java interface.
        // button.addActionListener(this);
        // ballSpeed.addChangeListener(this);
        labelSpeed = new JLabel("Speed: " + panel.getSpeed());

        panel.add(new JLabel("Number of ball: "));
        panel.add(textField);
        panel.add(button);
        panel.add(ballSpeed);
        panel.add(labelSpeed);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        Timer timer = new Timer(FPS, panel);
        timer.start();
    }
    // TODO: uncomment this and fixed the error. This function will call when the user click the button.
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String strNumOfBall = textField.getText();
//        System.out.println("Number of ball: " + strNumOfBall);
//    }

    // TODO: uncomment this and fixed the error. This function will call when the user changes the slider.
//    @Override
//    public void stateChanged(ChangeEvent e) {
//        JSlider source = (JSlider)e.getSource();
//        if (!source.getValueIsAdjusting()) {
//            int speed = source.getValue();
//            panel.setSpeed(speed);
//            labelSpeed.setText("Speed: " + speed);
//        }
//    }
}
