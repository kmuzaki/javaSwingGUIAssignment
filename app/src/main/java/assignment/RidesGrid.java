/* References:
 tpointtech, https://www.tpointtech.com/GridLayout
 */

package assignment;

import javax.swing.*;
import java.awt.*;

public class RidesGrid extends Button{
    JPanel createGrid() {
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(0, 4, 1, 1));
        grid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        
        Cards card = new Cards("Ride", "/cardIcons/maze.png");
        card.setBackground(Color.WHITE);
        grid.add(card);

        Cards train = new Cards("ride", "/cardIcons/steamTrains.png");
        card.setBackground(Color.WHITE);
        grid.add(train);

        Cards h = new Cards("ride", "/cardIcons/hauntedHouse.png");
        card.setBackground(Color.WHITE);
        grid.add(h);

        Cards fr = new Cards("ride", "/cardIcons/ferrisWheel.png");
        card.setBackground(Color.WHITE);
        grid.add(fr);

        Cards fly = new Cards("ride", "/cardIcons/flyover.png");
        card.setBackground(Color.WHITE);
        grid.add(fly);



        return grid;
    }
}
