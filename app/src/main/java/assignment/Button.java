package assignment;

import javax.swing.*;
import java.awt.*;

abstract public class Button {
    // abstract JButton createButton(String text);
    public JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 15));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setPreferredSize(new Dimension(200, 50)); // Set preferred size for the button
        return button;
    }
}