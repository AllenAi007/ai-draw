package com.ai.draw;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Test Line
 */
public class LineTests extends AbstractCanvasTests{

    @Test
    public void testDraw() {
        String[] command = "L 1 2 6 2".split(" ");
        Line line = new Line(canvas);
        line.draw(command);
        IntStream.range(0, line.getCanvasWidth()).forEach(w -> {
            IntStream.range(0, line.getCanvasHeight()).forEach(h -> {
                if (w >= 0 && w < 6 && h == 2 - 1) {
                    assertEquals("x", line.getTable()[w][h]);
                } else {
                    assertEquals(" ", line.getTable()[w][h]);
                }
            });
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawWithIllegalArgumentException() {
        String[] command = "Error Command".split(" ");
        Line line = new Line(canvas);
        line.draw(command);
    }
}
