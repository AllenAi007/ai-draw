package com.ai.draw;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test Canvas
 */
public class CanvasTest {

    @Test
    public void testDraw() {
        int width = 20;
        int height = 4;
        String[] command = ("C" + " " + width + " " + height).split(" ");
        Canvas canvas = new Canvas();
        canvas.draw(command);
        assertEquals(width, canvas.getWidth());
        assertEquals(height, canvas.getHeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawWithIllegalArgumentException() {
        String[] command = "Error Command".split(" ");
        Canvas canvas = new Canvas();
        canvas.draw(command);
    }
}
