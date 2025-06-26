package com.example;

import javax.swing.*;
import java.awt.*;

/**
 * A user-friendly GUI application that displays a "Hello World" message.
 */
public class App {
    
    /**
     * Creates and shows the GUI for the Hello World application.
     */
    private static void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Hello World Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Center on screen
        
        // Create the label with the greeting message
        HelloWorld helloWorld = new HelloWorld();
        JLabel label = new JLabel(helloWorld.getGreeting());
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setHorizontalAlignment(JLabel.CENTER);
        
        // Add the label to the frame
        frame.getContentPane().add(label);
        
        // Display the window
        frame.setVisible(true);
    }
    
    /**
     * The main method that launches the GUI application.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread to create and show the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}