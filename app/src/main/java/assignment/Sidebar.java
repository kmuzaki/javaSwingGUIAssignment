package assignment;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends Button{
    String[] buttons = {"Home", "Transport Rides", "Gentle Rides", "Roller Coasters", "Thrill Rides", "Water Rides", "Shops and Stalls",};

    JPanel createSidebar(){
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(Color.BLACK);
        // sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        sidebar.setAlignmentX(Component.CENTER_ALIGNMENT);

        for (int i = 0; i < buttons.length; i++) {
            JButton button = createButton(buttons[i]);
            sidebar.add(button);
        }

        return sidebar;
    }
}
