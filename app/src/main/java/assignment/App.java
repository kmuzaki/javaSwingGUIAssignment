package assignment;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame{
    public App() {
        setTitle("RCT: Classic");
        setSize(1000, 563);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a label and add it to the panel
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
        
        Sidebar sidebar = new Sidebar();
        panel.add(sidebar.createSidebar(), BorderLayout.WEST);

        Header header = new Header();
        panel.add(header.createHeader(), BorderLayout.NORTH);

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            App app = new App();
            app.setVisible(true);
        });
    }
}
