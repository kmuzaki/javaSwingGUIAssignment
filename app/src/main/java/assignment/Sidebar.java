package assignment;

import javax.swing.*;
import java.awt.*;

public class Sidebar{
    JPanel createSidebar(){
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(Color.BLACK);

        sidebar.add(new JLabel("Home"));


        return sidebar;
    }
}
