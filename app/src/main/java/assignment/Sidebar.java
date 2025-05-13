package assignment;

/*References:
 codingTechRoom, https://codingtechroom.com/question/add-space-between-buttons-boxlayout-java-swing
 stackoverflow, https://stackoverflow.com/questions/2560784/how-to-center-elements-in-the-boxlayout-using-center-of-the-element
 chatgpt, https://chatgpt.com/share/681b689f-5f20-800c-a801-f8d409acf479
 */

import javax.swing.*;
import java.awt.*;

public class Sidebar extends Button{
    String[] buttons = {"Home", "Transport Rides", "Gentle Rides", "Roller Coasters", "Thrill Rides", "Water Rides"};

    JPanel createSidebar(JScrollPane oldCardsGrid, JPanel oldPanel){
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(Color.BLACK);
        sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < buttons.length; i++) {
            JButton button = createButton(buttons[i], oldCardsGrid, oldPanel);
            sidebar.add(button);
            sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        }

        return sidebar;
    }

    @Override
    public JButton createButton(String text, JScrollPane oldCardsGrid, JPanel oldPanel) {
        JButton button = new JButton(text);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
    
        Dimension buttonSize = new Dimension(300, 50);
        button.setMaximumSize(buttonSize);
    
        button.addActionListener(new Listener(oldPanel)); // Only pass the panel now
    
        return button;
    }
    
}
