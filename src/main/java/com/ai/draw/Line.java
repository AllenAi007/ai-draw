package com.ai.draw;

import java.util.stream.IntStream;

/**
 * Draw line, extends AbstractCanvasDrawer which depends on Canvas
 */
public class Line extends AbstractCanvasDrawer {

    public Line(Canvas canvas) {
        super(canvas);
    }

    @Override
    public void fill(String... args) {
        int x1, y1, x2, y2;
        x1 = Integer.parseInt(args[1]);
        y1 = Integer.parseInt(args[2]);
        x2 = Integer.parseInt(args[3]);
        y2 = Integer.parseInt(args[4]);
        if(x1 != x2 && y1 != y2) {
            throw new IllegalArgumentException("Please make sure x1 == x2 or y1 == y2");
        }
        IntStream.range(x1 - 1, x2).forEach(w -> {
            IntStream.range(y1 - 1, y2).forEach(h -> {
                String ij = canvas.getTable()[w][h];
                if (ij == null || ij.equals(" ")) {
                    canvas.getTable()[w][h] = "x";
                }
            });
        });
    }

}
