package edu.touro.mco152.bm;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App a = new App();

    /**
     * This test method tests how long a.init takes in nanoseconds (performance)
     * IDK how long a method should reasonably take
     * Could this also be Time of Correct?
     */
    @Test
    public void testInitSpeed() {
        long startTime = System.nanoTime();
        a.init();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        assertTrue(TimeUnit.SECONDS.convert(duration, TimeUnit.NANOSECONDS)
                < 3);
    }
}