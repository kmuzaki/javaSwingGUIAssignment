/*
 Original code made by Andi Tubagus Keane with slight modifications
 
 References:
 geeksForGeeks, https://www.geeksforgeeks.org/java-actionlistener-in-awt/
 */

package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cards extends JButton {

    Cards(String rideName, String imgPath, String articleLink) {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        setLayout(new BorderLayout());

        setPreferredSize(new Dimension(250, 250));
        // setMaximumSize(new Dimension(250, 150));
        // setMinimumSize(new Dimension(250, 150));

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

        // Add action listener to open article link
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show message dialog for full information for ride
                JOptionPane.showMessageDialog(null, "Full information for " + rideName + ":\n" + articleLink,
                        "Ride Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
