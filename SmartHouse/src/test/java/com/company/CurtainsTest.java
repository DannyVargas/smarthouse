package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Observable;

import static org.junit.Assert.assertEquals;

public class CurtainsTest {

    private Curtains curtainsUnderTest;

    @Before
    public void setUp() {
        curtainsUnderTest = new Curtains("name", 100, 50);
    }

    @Test
    public void testUpdate() {
        // Setup
        final Observable o = new Observable();

        // Run the test
        curtainsUnderTest.update(o, 120);

        // Verify the results
        assertEquals("Curtains closed",curtainsUnderTest.status);
        // Run the test
        curtainsUnderTest.update(o, 40);

        // Verify the results
        assertEquals("Curtains totally opened",curtainsUnderTest.status);
        // Run the test
        curtainsUnderTest.update(o, 60);

        // Verify the results
        assertEquals("Curtains in the middle",curtainsUnderTest.status);

    }
}
