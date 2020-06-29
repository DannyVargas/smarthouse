package com.company;

import org.junit.Test;

import java.io.IOException;

public class MainTest {

    @Test
    public void testMain() throws Exception {
        // Setup

        // Run the test
        Main.main(new String[]{"value"});

        // Verify the results
    }

    @Test(expected = IOException.class)
    public void testMain_ThrowsIOException() throws Exception {
        // Setup

        // Run the test
        Main.main(new String[]{"value"});
    }

    @Test(expected = InterruptedException.class)
    public void testMain_ThrowsInterruptedException() throws Exception {
        // Setup

        // Run the test
        Main.main(new String[]{"value"});
    }
}
