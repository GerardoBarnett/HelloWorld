package com.example;

/**
 * A simple Hello World application that displays a greeting message.
 */
public class HelloWorld {
    
    /**
     * Returns the greeting message.
     * 
     * @return the greeting message
     */
    public String getGreeting() {
        return "Hello World";
    }
    
    /**
     * The main method that prints the greeting message.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        HelloWorld app = new HelloWorld();
        System.out.println(app.getGreeting());
    }
}