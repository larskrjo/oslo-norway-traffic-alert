package net.larskristian.ruter.traffic;

import net.larskristian.ruter.traffic.gui.Gui;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui();
            }
        });
    }

}
