/* References:
 tpointtech, https://www.tpointtech.com/GridLayout
 */

package assignment;

import javax.swing.*;
import java.awt.*;

public class RidesGrid extends Button{
    JPanel createGrid() {
        String[] rides = {"Steam Trains", 
        "Chair lift cars", 
        "Haunted House", 
        "Ferris Wheel", 
        "Hedge Maze", 
        "Merry-go-round", 
        "Wooden Roller Coaster",
        "Wooden Wild Mouse",
        "Junior Roller Coaster",
        "Mini Train Coaster",
        "Looping Roller Coaster",
        "Suspended Swinging Cars",
        "Twist",
        "Pirate Ship",
        "Go karts",
        "Dinghy Slide",
        "Rowing Boats",
        };

        String[] paths = {"/cardIcons/steamTrains.png",
        "/cardIcons/flyover.png",
        "/cardIcons/hauntedHouse.png",
        "/cardIcons/ferrisWheel.png",
        "/cardIcons/maze.png",
        "/cardIcons/merryGoRound.png",
        "/cardIcons/RCWood.png",
        "/cardIcons/RCWoodMouse.png",
        "/cardIcons/RCLdBird.png",
        "/cardIcons/RCMiniTrain.png",
        "/cardIcons/RCLoop.png",
        "/cardIcons/RCSuspendSwing.png",
        "/cardIcons/twist.png",
        "/cardIcons/pirateShip.png",
        "/cardIcons/goKarts.png",
        "/cardIcons/wtrDingSlide.png",
        "/cardIcons/wtrRowBoats.png",
        };

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(0, 4, 10, 10));
        grid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < rides.length; i++) {
            Cards card = new Cards(rides[i], paths[i]);
            card.setBackground(Color.WHITE);
            grid.add(card);
        }

        return grid;
    }
}
