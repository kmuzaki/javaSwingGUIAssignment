/* References:
 tpointtech, https://www.tpointtech.com/GridLayout
 */

package assignment;

import javax.swing.*;
import java.awt.*;

public class RidesGrid extends JButton{
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

        String[] links = {"https://rct.fandom.com/wiki/Miniature_Railway",
            "https://rct.fandom.com/wiki/Chairlift",
            "https://rct.fandom.com/wiki/Haunted_House",
            "https://rct.fandom.com/wiki/Ferris_Wheel",
            "https://rct.fandom.com/wiki/Maze",
            "https://rct.fandom.com/wiki/Merry-Go-Round",
            "https://rct.fandom.com/wiki/Wooden_Roller_Coaster",
            "https://rct.fandom.com/wiki/Wooden_Wild_Mouse",
            "https://rct.fandom.com/wiki/Junior_Roller_Coaster",
            "https://rct.fandom.com/wiki/Mine_Train_Coaster",
            "https://rct.fandom.com/wiki/Looping_Roller_Coaster",
            "https://rct.fandom.com/wiki/Suspended_Swinging_Coaster",
            "https://rct.fandom.com/wiki/Twist",
            "https://rct.fandom.com/wiki/Pirate_Ship",
            "https://rct.fandom.com/wiki/Go_Karts",
            "https://rct.fandom.com/wiki/Dinghy_Slide",
            "https://rct.fandom.com/wiki/Boat_Hire"
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
