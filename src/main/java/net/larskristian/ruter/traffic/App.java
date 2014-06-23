package net.larskristian.ruter.traffic;

import net.larskristian.ruter.traffic.gui.Gui;
import net.larskristian.ruter.traffic.network.http.Requests;

import javax.swing.*;

/**
 * Application that initiates the whole program.
 */
public class App {

    Gui gui;

    public static void main(String[] args) {
        new App();
    }

    App() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui = new Gui();
            }
        });
        final String response = Requests.get("http://reisapi.ruter.no/Place/GetStop/10");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui.getLabel().setText(response);
            }
        });
    }

}
