package org.example;

import javax.swing.*;

public class AppCalculator extends Panel {
    private JFrame frame;

    public AppCalculator() {
        frame = new JFrame();
    }

    public void init() {
        frame.setTitle("Calculator");
        frame.setSize(500, 410);
        frame.setLocationRelativeTo(null);
        frame.add(new Panel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
    }
}



