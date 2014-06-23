package net.larskristian.ruter.traffic.gui;

import net.larskristian.ruter.traffic.statics.Constants;

import javax.swing.*;

/**
 * Created by Lars K. Johansen on 19/06/14.
 */
public class Gui extends JFrame {

    private JLabel label;

    public Gui() {
        setup();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setup() {
        setTitle(Constants.TITLE);
        setSize(Constants.WIDTH, Constants.HEIGHT);

        // Add panel with info
        label = new JLabel("default value");
        add(label);
    }

    public JLabel getLabel() {
        return label;
    }

}
