package com.company;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.file.WatchService;
import java.util.List;

//import static org.mockito.Mockito.mock;

public class FileWatcherTest {

    private FileWatcher fileWatcherUnderTest;

    @Before
    public void setUp() {
        fileWatcherUnderTest = new FileWatcher(new File("filename.txt"));
    }

    @Test
    public void testWatch() {
        // Setup

        // Run the test
        fileWatcherUnderTest.watch();

        // Verify the results
    }

    @Test
    public void testRun() {
        // Setup

        // Run the test
        fileWatcherUnderTest.run();

        // Verify the results
    }

    @Test
    public void testAddListener() {
        // Setup
        //final FileListener mockListener = mock(FileListener.class);

        // Run the test
        //final FileWatcher result = fileWatcherUnderTest.addListener(mockListener);

        // Verify the results
    }

    @Test
    public void testRemoveListener() {
        // Setup
       // final FileListener mockListener = mock(FileListener.class);

        // Run the test
        //final FileWatcher result = fileWatcherUnderTest.removeListener(mockListener);

        // Verify the results
    }

    @Test
    public void testGetWatchServices() {
        // Setup

        // Run the test
        final List<WatchService> result = FileWatcher.getWatchServices();

        // Verify the results
    }
}
