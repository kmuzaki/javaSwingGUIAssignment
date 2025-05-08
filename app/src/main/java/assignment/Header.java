package assignment;

import javax.swing.*;
import java.awt.*;

public class Header {
    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        header.setBackground(Color.DARK_GRAY);
        header.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel logo = new JLabel("Rollercoaster Tycoon Classic: Rides list");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("SansSerif", Font.BOLD, 20));
        header.add(logo);

        header.add(Box.createHorizontalGlue()); // Pushes the logo to the left

        header.add(navButtons.createNavButtons()); // Add the navigation buttons

        return header;
    }
}
