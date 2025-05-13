package assignment;

/*References:
 codingTechRoom, https://codingtechroom.com/question/add-space-between-buttons-boxlayout-java-swing
 stackoverflow, https://stackoverflow.com/questions/2560784/how-to-center-elements-in-the-boxlayout-using-center-of-the-element
 chatgpt, https://chatgpt.com/share/681b689f-5f20-800c-a801-f8d409acf479
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sidebar extends Button{
    String[] buttons = {"Home", "Transport Rides", "Gentle Rides", "Roller Coasters", "Thrill Rides", "Water Rides", "Shops and Stalls",};

    JPanel createSidebar(){
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(Color.BLACK);
        sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < buttons.length; i++) {
            JButton button = createButton(buttons[i]);
            sidebar.add(button);
            sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        }

        return sidebar;
    }

    @Override
    public JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Set button size
        Dimension buttonSize = new Dimension(300, 50); // Choose your consistent size
        button.setMaximumSize(buttonSize);             // Important for BoxLayout Y_AXIS

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //Show message dialog for full information for ride
                System.out.println(button.getText() + " is pressed!");
            }
        });

        return button;
    }
}
