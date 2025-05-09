package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class navButtons{
    static JPanel createNavButtons() {
        JPanel navButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        navButtons.setBackground(Color.DARK_GRAY);

        // Create youtube Button
        JButton yt = new JButton("YouTube");
        yt.setBackground(Color.RED);
        yt.setForeground(Color.WHITE);
        yt.setFont(new Font("Arial", Font.BOLD, 15));
        yt.setFocusPainted(false);
        yt.setBorderPainted(false);
        yt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/@swift_2845"));
                } catch (IOException | URISyntaxException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });


        // Create Kofi

        JButton kofi = new JButton("Kofi");
        kofi.setBackground(Color.ORANGE);
        kofi.setForeground(Color.BLACK);
        kofi.setFont(new Font("Arial", Font.BOLD, 15));
        kofi.setFocusPainted(false);
        kofi.setBorderPainted(false);
        kofi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ko-fi.com/"));
                } catch (IOException | URISyntaxException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        navButtons.add(yt);
        navButtons.add(kofi);

        return navButtons;
    }
}