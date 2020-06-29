package com.company;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HouseTest {

    private House houseUnderTest;

    @Before
    public void setUp() {
        houseUnderTest = new House();
        houseUnderTest.sensors = new ArrayList<>(Arrays.asList(new Sensor("name", 0)));
        houseUnderTest.devices = new ArrayList<>(Arrays.asList(new Device("name")));
    }

    @Test
    public void testLoad() throws Exception {
        // Setup

        // Run the test
        houseUnderTest.load();

        // Verify the results
        assertEquals("temperatura",houseUnderTest.sensors.get(0).getName());
        assertEquals("luz",houseUnderTest.sensors.get(1).getName());
        assertEquals("apertura",houseUnderTest.sensors.get(2).getName());

        assertEquals("aire_acondicionado",houseUnderTest.devices.get(0).name);
        assertEquals("cortinas_dormitorio_principal",houseUnderTest.devices.get(1).name);
        assertEquals("puerta_principal",houseUnderTest.devices.get(2).name);
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoad_ThrowsFileNotFoundException() throws Exception {
        // Setup

        // Run the test
        houseUnderTest.load();
    }

    @Test
    public void testSimulation() throws Exception {
        // Setup
        final File file = new File("e:/values.txt");
        houseUnderTest.load();
        // Run the test
        houseUnderTest.simulation(file);

        // Verify the results
        assertEquals(50,houseUnderTest.sensors.get(0).getValue());
        assertEquals(50,houseUnderTest.sensors.get(1).getValue());
        assertEquals(1,houseUnderTest.sensors.get(2).getValue());
    }

    @Test(expected = FileNotFoundException.class)
    public void testSimulation_ThrowsFileNotFoundException() throws Exception {
        // Setup
        final File file = new File("filename.txt");

        // Run the test
        houseUnderTest.simulation(file);
    }

    @Test
    public void testSearch() {
        // Setup

        // Run the test
        final Integer result = houseUnderTest.search("luz");

        // Verify the results
        //assertEquals(java.util.Optional.of(0), result);
    }
}
