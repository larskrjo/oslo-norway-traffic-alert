package net.larskristian.ruter.traffic.gui;

import net.larskristian.ruter.traffic.statics.Constants;

import javax.swing.*;

/**
 * Created by Lars K. Johansen on 19/06/14.
 */
public class Gui extends JFrame {

    public Gui() {
        setTitle(Constants.TITLE);
        setSize(Constants.WIDTH, Constants.HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
