/* References:
 tpointtech, https://www.tpointtech.com/GridLayout
 */

package assignment;

import javax.swing.*;
import java.awt.*;

public class RollerCoasters extends JButton {
    JPanel createGrid() {
        String[] rides = {
                "Wooden Roller Coaster",
                "Wooden Wild Mouse",
                "Junior Roller Coaster",
                "Mini Train Coaster",
                "Looping Roller Coaster",
                "Suspended Swinging Cars",
        };

        String[] paths = { 
                "/cardIcons/RCWood.png",
                "/cardIcons/RCWoodMouse.png",
                "/cardIcons/RCLdBird.png",
                "/cardIcons/RCMiniTrain.png",
                "/cardIcons/RCLoop.png",
                "/cardIcons/RCSuspendSwing.png",
                
        };

        String[] links = {
                "https://rct.fandom.com/wiki/Wooden_Roller_Coaster",
                "https://rct.fandom.com/wiki/Wooden_Wild_Mouse",
                "https://rct.fandom.com/wiki/Junior_Roller_Coaster",
                "https://rct.fandom.com/wiki/Mine_Train_Coaster",
                "https://rct.fandom.com/wiki/Looping_Roller_Coaster",
                "https://rct.fandom.com/wiki/Suspended_Swinging_Coaster",
               
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
