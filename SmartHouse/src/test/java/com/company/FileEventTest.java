package com.company;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class FileEventTest {

    private FileEvent fileEventUnderTest;

    @Before
    public void setUp() {
        fileEventUnderTest = new FileEvent(new File("filename.txt"));
    }

    @Test
    public void testGetFile() {
        // Setup
        final File expectedResult = new File("filename.txt");

        // Run the test
        final File result = fileEventUnderTest.getFile();

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
