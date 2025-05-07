package assignment;

import javax.swing.*;
import java.awt.*;

public class Header {
    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        header.setBackground(Color.BLACK);
        header.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel logo = new JLabel("Rollercoaster Tycoon Classic: Rides list");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Arial", Font.BOLD, 15));
        header.add(logo);

        header.add(Box.createHorizontalGlue()); // Pushes the logo to the left

        JLabel searchBar = new JLabel("Search Bar");
        searchBar.setForeground(Color.WHITE);
        header.add(searchBar);

        return header;
    }
}
