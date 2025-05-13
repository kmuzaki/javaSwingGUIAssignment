/* References:
 tpointtech, https://www.tpointtech.com/GridLayout
 */

package assignment;

import javax.swing.*;
import java.awt.*;

public class TransportRides extends JButton{
    JPanel createGrid() {
        String[] rides = {"Steam Trains", 
        "Chair lift cars"
        };

        String[] paths = {"/cardIcons/steamTrains.png",
        "/cardIcons/flyover.png"
        };

        String[] links = {"https://rct.fandom.com/wiki/Miniature_Railway",
            "https://rct.fandom.com/wiki/Chairlift",
        };

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
