package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Observable;

import static org.junit.Assert.assertEquals;

public class AirConditionerTest {

    private AirConditioner airConditionerUnderTest;

    @Before
    public void setUp() {
        airConditionerUnderTest = new AirConditioner("name", 25, 12);
    }

    @Test
    public void testUpdate() {
        // Setup
        final Observable o = new Observable();

        // Run the test
        airConditionerUnderTest.update(o, 30);

        // Verify the results
        assertEquals("Cooling....",airConditionerUnderTest.status);
        // Run the test
        airConditionerUnderTest.update(o, 10);

        // Verify the results
        assertEquals("Heating...",airConditionerUnderTest.status);
        // Run the test
        airConditionerUnderTest.update(o, 20);

        // Verify the results
        assertEquals("Off",airConditionerUnderTest.status);
    }
}
