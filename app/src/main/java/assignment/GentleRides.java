package assignment;

import javax.swing.*;
import java.awt.*;;

public class GentleRides {
    JPanel createGrid() {
        String[] rides = {
        "Haunted House",
        "Ferris Wheel", 
        "Hedge Maze", 
        "Merry-go-round", 
        
        };

        String[] paths = {
        "/cardIcons/hauntedHouse.png",
        "/cardIcons/ferrisWheel.png",
        "/cardIcons/maze.png",
        "/cardIcons/merryGoRound.png",
        
        };

        String[] links = {
            "https://rct.fandom.com/wiki/Haunted_House",
            "https://rct.fandom.com/wiki/Ferris_Wheel",
            "https://rct.fandom.com/wiki/Maze",
            "https://rct.fandom.com/wiki/Merry-Go-Round",
            
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
