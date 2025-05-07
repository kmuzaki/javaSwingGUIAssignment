package assignment;

import javax.swing.*;

abstract public class Button {
    // abstract JButton createButton(String text);
    public JButton createButton(String text) {
        JButton button = new JButton(text);
        return button;
    }
}