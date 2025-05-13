// package assignment;

// import java.awt.BorderLayout;

// import javax.swing.JPanel;
// import javax.swing.JScrollPane;

// public class Listener implements java.awt.event.ActionListener {
//     private JPanel oldPanel;
//     private JPanel newPanel;
//     private JScrollPane oldPane;

//     // Constructor to initialize the splitPane
//     public Listener(JScrollPane oldCardsGrid, JPanel oldPanel) {
//         this.oldPane = oldCardsGrid;
//         this.oldPanel = oldPanel;
//     }

//     @Override
//     public void actionPerformed(java.awt.event.ActionEvent e) {
//         if (e.getSource() instanceof javax.swing.JButton) {
//             javax.swing.JButton button = (javax.swing.JButton) e.getSource();
//             String buttonText = button.getText();

//             // Create a new panel based on the button text
//             switch (buttonText) {
//                 case "Home":
//                     newPanel = new RidesGrid().createGrid();
//                     break;
//                 case "Transport Rides":
//                     newPanel = new TransportRides().createGrid();
//                     break;
//                 case "Gentle Rides":
//                     newPanel = new GentleRides().createGrid();
//                     break;
//                 default:
//                     return; // Unknown button, do nothing
//             }

//             // Update the split pane with the new panel
//             JScrollPane scrollPane = new JScrollPane(newPanel);
//             scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//             scrollPane.setWheelScrollingEnabled(true);
//             scrollPane.getVerticalScrollBar().setUnitIncrement(40);
//             oldPanel.remove(oldPane);
//             oldPanel.add(scrollPane, BorderLayout.CENTER);
//             oldPanel.revalidate(); // re-layout components
//             oldPanel.repaint(); // redraw panel
//             oldPane = scrollPane;
//         }
//     }
// }

package assignment;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.*;

public class Listener implements java.awt.event.ActionListener {
    private final JPanel parentPanel;

    public Listener(JPanel parentPanel) {
        this.parentPanel = parentPanel;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();

            JPanel newPanel;

            // Determine which panel to show
            switch (buttonText) {
                case "Home":
                    newPanel = new RidesGrid().createGrid();
                    break;
                    
                case "Transport Rides":
                    newPanel = new TransportRides().createGrid();
                    break;

                case "Gentle Rides":
                    newPanel = new GentleRides().createGrid();
                    break;

                case "Roller Coasters":
                    newPanel = new RollerCoasters().createGrid();
                    break;

                case "Thrill Rides":
                    newPanel = new ThrillRides().createGrid();
                    break;

                case "Water Rides":
                    newPanel = new WaterRides().createGrid();
                    break;
                default:
                    return;
            }

            JScrollPane newScrollPane = new JScrollPane(newPanel);
            newScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            newScrollPane.setWheelScrollingEnabled(true);
            newScrollPane.getVerticalScrollBar().setUnitIncrement(40);

            // Remove current center component and replace with new one
            Component[] components = parentPanel.getComponents();
            for (Component comp : components) {
                // Only remove CENTER component (not WEST or NORTH)
                Object constraints = ((BorderLayout) parentPanel.getLayout()).getConstraints(comp);
                if ("Center".equals(constraints)) {
                    parentPanel.remove(comp);
                    break;
                }
            }

            parentPanel.add(newScrollPane, BorderLayout.CENTER);
            parentPanel.revalidate();
            parentPanel.repaint();
        }
    }
}
