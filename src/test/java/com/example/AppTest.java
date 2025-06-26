package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the App class.
 */
public class AppTest {
    
    /**
     * Test that the App class can be instantiated without errors.
     */
    @Test
    public void testAppCreation() {
        App app = new App();
        assertNotNull(app);
    }
    
    /**
     * Test that the main method can be called without errors.
     * Note: This test only verifies that the method doesn't throw exceptions,
     * as testing Swing components would require UI testing frameworks.
     */
    @Test
    public void testMainMethod() {
        try {
            // Just verify that calling main doesn't throw an exception
            // We're not actually showing the GUI in the test
            App.main(new String[]{});
            // If we get here without exception, the test passes
            assertTrue(true);
        } catch (Exception e) {
            fail("App.main() threw an exception: " + e.getMessage());
        }
    }
}