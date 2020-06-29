package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Observable;

import static org.junit.Assert.assertEquals;

public class EntranceTest {

    private Entrance entranceUnderTest;

    @Before
    public void setUp() {
        entranceUnderTest = new Entrance("name");
    }

    @Test
    public void testUpdate() {
        // Setup
        final Observable o = new Observable();

        // Run the test
        entranceUnderTest.update(o, 0);

        // Verify the results
        assertEquals("Opened",entranceUnderTest.status);

        // Run the test
        entranceUnderTest.update(o, 0);

        // Verify the results
        assertEquals("Closed",entranceUnderTest.status);
    }
}
