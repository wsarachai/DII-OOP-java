package org.dii.oop.lesson08.exercise01;

import javax.swing.*;

public class Lesson extends JFrame {
    protected final int FPS = 1000/120;

    public Lesson() {
        super("Duck Simulator");
        DuckSimulator duckSimulatorPanel = new DuckSimulator();

        add(duckSimulatorPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        Timer timer = new Timer(FPS, duckSimulatorPanel);
        timer.start();
    }

    public static void run() {
        Lesson lesson = new Lesson();
        lesson.setVisible(true);
    }
}