package com.company;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class FileAdapterTest {

    private FileAdapter fileAdapterUnderTest;

    @Before
    public void setUp() {
        fileAdapterUnderTest = new FileAdapter() {
        };
    }

    @Test
    public void testOnCreated() {
        // Setup
        final FileEvent event = new FileEvent(new File("filename.txt"));

        // Run the test
        fileAdapterUnderTest.onCreated(event);

        // Verify the results
    }

    @Test
    public void testOnModified() {
        // Setup
        final FileEvent event = new FileEvent(new File("filename.txt"));

        // Run the test
        fileAdapterUnderTest.onModified(event);

        // Verify the results
    }

    @Test
    public void testOnDeleted() {
        // Setup
        final FileEvent event = new FileEvent(new File("filename.txt"));

        // Run the test
        fileAdapterUnderTest.onDeleted(event);

        // Verify the results
    }
}
