package assignment;

import javax.swing.*;
import java.awt.*;

public class navButtons{
    static JPanel createNavButtons() {
        JPanel navButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        navButtons.setBackground(Color.BLUE);

        // Create youtube Button
        JButton yt = new JButton("YouTube");
        yt.setBackground(Color.RED);
        yt.setForeground(Color.WHITE);
        yt.setFont(new Font("Arial", Font.PLAIN, 15));
        yt.setFocusPainted(false);
        yt.setBorderPainted(false);

        // Create Kofi

        JButton kofi = new JButton("Kofi");
        kofi.setBackground(Color.ORANGE);
        kofi.setForeground(Color.WHITE);
        kofi.setFont(new Font("Arial", Font.PLAIN, 15));
        kofi.setFocusPainted(false);
        kofi.setBorderPainted(false);

        navButtons.add(yt);
        navButtons.add(kofi);

        return navButtons;
    }
}