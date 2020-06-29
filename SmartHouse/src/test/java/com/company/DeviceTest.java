package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Observable;

import static org.junit.Assert.assertEquals;

public class DeviceTest {

    private Device deviceUnderTest;

    @Before
    public void setUp() {
        deviceUnderTest = new Device("name");
    }

    @Test
    public void testUpdate() {
        // Setup
        final Observable o = new Observable();

        // Run the test
        deviceUnderTest.update(o, 10);

        // Verify the results
        assertEquals("name",deviceUnderTest.name);
    }
}
