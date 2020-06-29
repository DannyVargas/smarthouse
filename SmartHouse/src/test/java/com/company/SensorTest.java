package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SensorTest {

    private Sensor sensorUnderTest;

    @Before
    public void setUp() {
        sensorUnderTest = new Sensor("name", 0);
    }
    @Test
    public void testGetName(){
        assertEquals("name",sensorUnderTest.getName());

    }
}
