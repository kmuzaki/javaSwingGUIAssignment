/* References:
 tpointtech, https://www.tpointtech.com/GridLayout
 */

package assignment;

import javax.swing.*;
import java.awt.*;

public class ThrillRides extends JButton {
    JPanel createGrid() {
        String[] rides = {
                "Twist",
                "Pirate Ship",
                "Go karts",
        };

        String[] paths = {
                "/cardIcons/twist.png",
                "/cardIcons/pirateShip.png",
                "/cardIcons/goKarts.png",
        };

        String[] links = {
                "https://rct.fandom.com/wiki/Twist",
                "https://rct.fandom.com/wiki/Pirate_Ship",
                "https://rct.fandom.com/wiki/Go_Karts",
                
        };

        // JPanel gridPanel = new JPanel();
        // gridPanel.setLayout(new GridLayout(0, 4, 10, 10)); // 4 columns, horizontal and vertical gaps of 10px

        // for (int i = 0; i < rides.length; i++) {
        //     Cards card = new Cards(rides[i], paths[i], links[i]);
        //     // Set a fixed size for each card
        //     card.setPreferredSize(new Dimension(250, 150));
        //     card.setMaximumSize(new Dimension(250, 150));
        //     card.setMinimumSize(new Dimension(250, 150)); // Ensure card size is fixed

        //     // Avoid stretching by setting these properties
        //     card.setBackground(Color.WHITE);
        //     gridPanel.add(card);
        // }

        // return gridPanel;

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(0, 4, 10, 10));
        grid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < rides.length; i++) {
            Cards card = new Cards(rides[i], paths[i], links[i]);
            card.setBackground(Color.WHITE);
            grid.add(card);
        }

        return grid;
    }
}
