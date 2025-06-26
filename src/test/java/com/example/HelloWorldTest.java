package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests for the HelloWorld application.
 */
public class HelloWorldTest {
    
    /**
     * Test that the getGreeting method returns the correct message.
     */
    @Test
    public void testGetGreeting() {
        HelloWorld app = new HelloWorld();
        assertEquals("Hello World", app.getGreeting());
    }
    
    /**
     * Test that the main method prints the correct message.
     */
    @Test
    public void testMainMethod() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        
        try {
            // Call the main method
            HelloWorld.main(new String[]{});
            
            // Verify the output
            assertEquals("Hello World" + System.lineSeparator(), outContent.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }
    }
}