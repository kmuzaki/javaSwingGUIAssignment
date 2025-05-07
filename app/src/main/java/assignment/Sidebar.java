package assignment;

/*References:
 codingTechRoom, https://codingtechroom.com/question/add-space-between-buttons-boxlayout-java-swing
 stackoverflow, https://stackoverflow.com/questions/2560784/how-to-center-elements-in-the-boxlayout-using-center-of-the-element
 chatgpt, https://chatgpt.com/share/681b689f-5f20-800c-a801-f8d409acf479
 */

import javax.swing.*;
import java.awt.*;

public class Sidebar extends Button{
    String[] buttons = {"Home", "Transport Rides", "Gentle Rides", "Roller Coasters", "Thrill Rides", "Water Rides", "Shops and Stalls",};

    JPanel createSidebar(){
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(Color.BLACK);
        // sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < buttons.length; i++) {
            // Create buttons using looping
            JButton button = createButton(buttons[i]);
            button.setBackground(Color.GRAY);
            button.setForeground(Color.WHITE);
            button.setFont(new Font("Arial", Font.PLAIN, 15));
            button.setFocusPainted(false);
            button.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10)); // Add padding inside the button
            button.setBorderPainted(false);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);

            // Set button size
            Dimension buttonSize = new Dimension(300, 50); // Choose your consistent size
            button.setMaximumSize(buttonSize);             // Important for BoxLayout Y_AXIS

            // Add buttons and spacing
            sidebar.add(button);
            sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        }

        return sidebar;
    }
}
