/*
 * Original code made by Andi Tubagus Keane with slight modifications
 */


package assignment;

import javax.swing.*;
import java.awt.*; 

public class Cards extends JPanel {
    Cards(String rideName, String imgPath) {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(100, 200));

        // Add character image
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Load image using getResource
        ImageIcon icon = new ImageIcon(getClass().getResource(imgPath));
        imageLabel.setIcon(icon);
        add(imageLabel, BorderLayout.CENTER);

        // Add character name
        JLabel nameLabel = new JLabel(rideName, JLabel.CENTER);
        nameLabel.setForeground(Color.BLACK);
        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        nameLabel.setBackground(Color.WHITE);
        nameLabel.setOpaque(true);
        add(nameLabel, BorderLayout.SOUTH);
    }
}
